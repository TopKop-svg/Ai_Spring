package org.example.ai_spring;

import org.springframework.context.annotation.Bean;

public interface MessageProvider {
    @Bean (name = "message", initMethod = "init")
    String getMessage();


}
