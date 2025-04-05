package org.example.ai_spring;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Пока, Spring!";
    }
}
