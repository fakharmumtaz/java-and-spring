package com.javalogic.jms;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;
/* Here’s a simple JMS (Java Message Service) example demonstrating message production and consumption with acknowledgment using ActiveMQ as the message broker.
🔹 Steps in This Example
Producer sends a message to a JMS queue.
Consumer receives the message and manually acknowledges it.
Uses Client Acknowledgment Mode (Session.CLIENT_ACKNOWLEDGE).
*/
public class JMSProducer {
    public static void main(String[] args) {
        // ActiveMQ broker URL
        String brokerUrl = "tcp://localhost:61616";
        String queueName = "testQueue";

        try {
            // 1. Create a connection factory
            ConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);

            // 2. Establish a connection
            Connection connection = factory.createConnection();
            connection.start();

            // 3. Create a session (non-transacted, auto-acknowledge)
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // 4. Create a queue
            Destination destination = session.createQueue(queueName);

            // 5. Create a message producer
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            // 6. Send a message
            TextMessage message = session.createTextMessage("Hello, JMS! Testing JMS with ActiveMQ Broker Simple example ");
            producer.send(message);
            System.out.println("Message Sent: " + message.getText());

            // 7. Clean up
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
/*
Connects to ActiveMQ at tcp://localhost:61616.
Creates a queue named "testQueue".
Sends a text message (Hello, JMS!).
Uses Session.AUTO_ACKNOWLEDGE for automatic acknowledgment. */
