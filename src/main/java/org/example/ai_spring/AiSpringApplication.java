package org.example.ai_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AiSpringApplication {

    public static void main(String[] args) {
        //ApplicationContext context = new GerGrovv
       // SpringApplication.run(AiSpringApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml", "component.xml");
    }

}
