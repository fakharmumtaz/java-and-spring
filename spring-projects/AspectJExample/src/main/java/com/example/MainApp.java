package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.AppConfig;
import com.example.service.MyService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = context.getBean(MyService.class);
        myService.performTask();

        try {
            myService.throwError();
        } catch (Exception ignored) {}

        context.close();
    }
}
