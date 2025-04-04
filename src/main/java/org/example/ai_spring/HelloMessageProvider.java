package org.example.ai_spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Привет, Spring!";
    }
}
