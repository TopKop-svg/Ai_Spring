package org.example.ai_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class AiSpringApplication {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService service = context.getBean(MessageService.class);
        service.printMessage(context.getBean(MessageProvider.class));
        System.out.println("Привет");
    }

}
