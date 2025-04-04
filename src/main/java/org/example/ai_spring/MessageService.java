package org.example.ai_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    final MessageProvider messageProvider;

    @Autowired
    public MessageService(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    void printMessage(MessageProvider messageProvider) {
        System.out.println(messageProvider.getMessage());
    }
}
