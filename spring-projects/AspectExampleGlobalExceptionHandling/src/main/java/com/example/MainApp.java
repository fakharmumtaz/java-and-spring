package com.example;
import com.example.config.AppConfig;
import com.example.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService service = context.getBean(MyService.class);
        try {
            service.processData();
        } catch (Exception e) {
            System.out.println("Main caught: " + e.getMessage());
        }

        context.close();
    }
}
