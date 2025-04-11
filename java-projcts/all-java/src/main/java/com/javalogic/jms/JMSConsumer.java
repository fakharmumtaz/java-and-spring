package com.javalogic.jms;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JMSConsumer {
    public static void main(String[] args) {
        String brokerUrl = "tcp://localhost:61616";
        String queueName = "testQueue";

        try {
            // 1. Create a connection factory
            ConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);

            // 2. Establish a connection
            Connection connection = factory.createConnection();
            connection.start();

            // 3. Create a session with CLIENT_ACKNOWLEDGE mode
            Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

            // 4. Create a queue
            Destination destination = session.createQueue(queueName);

            // 5. Create a message consumer
            MessageConsumer consumer = session.createConsumer(destination);

            // 6. Receive the message
            Message message = consumer.receive();

            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                System.out.println("Received: " + textMessage.getText());

                // 7. Manually acknowledge the message
                textMessage.acknowledge();
                System.out.println("Message Acknowledged.");
            }

            // 8. Clean up
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
/* ✅ What’s Happening?

Connects to ActiveMQ at tcp://localhost:61616.

Listens for messages from "testQueue".

Uses Session.CLIENT_ACKNOWLEDGE → the message is not acknowledged automatically.

Manually calls acknowledge() after processing the message.

4️⃣ Running the Example
Step 1: Start ActiveMQ
Ensure ActiveMQ broker is running. If you have ActiveMQ installed, start it with:

sh
activemq start
Step 2: Run the Producer
Compile and run:

sh
javac JMSProducer.java
java JMSProducer
✅ Output:

yaml
Message Sent: Hello, JMS!
Step 3: Run the Consumer
Compile and run:

sh
javac JMSConsumer.java
java JMSConsumer
✅ Output:

makefile
Received: Hello, JMS!
Message Acknowledged.
5️⃣ Understanding JMS Acknowledgment Modes
Mode	Description
AUTO_ACKNOWLEDGE	Messages are automatically acknowledged once received.
CLIENT_ACKNOWLEDGE	Consumer must manually acknowledge using message.acknowledge().
DUPS_OK_ACKNOWLEDGE	Lazy acknowledgment, allows duplicates for efficiency.
SESSION_TRANSACTED	Full transaction support (commit/rollback).
6️⃣ Why Use CLIENT_ACKNOWLEDGE?
Ensures that the message is not lost if processing fails.

If a failure occurs before acknowledge(), the message remains in the queue and can be reprocessed.

Useful for ensuring data integrity in applications that require reliable processing.

🎯 Key Takeaways
✅ JMSProducer sends a message to ActiveMQ.
✅ JMSConsumer receives and manually acknowledges the message.
✅ Uses ActiveMQConnectionFactory to connect.
✅ Session.CLIENT_ACKNOWLEDGE ensures explicit message acknowledgment.*/