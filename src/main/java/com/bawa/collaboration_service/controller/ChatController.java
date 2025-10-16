package com.bawa.collaboration_service.controller;

import com.bawa.collaboration_service.entity.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }
    // Receives messages from /app/private-message
    @MessageMapping("/private-message")
    public void sendPrivateMessage(@Payload ChatMessage message) {
        // Send message to a specific user’s queue
        messagingTemplate.convertAndSendToUser(
                String.valueOf(message.getReceiverId()), // <-- Integer
                "/private",
                message
        );
    }
}
