package com.bawa.collaboration_service.controller;

import com.bawa.collaboration_service.entity.ChatMessage;
import com.bawa.collaboration_service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    MessageService messageService;

    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }
    @MessageMapping("/private-message")
    public void sendPrivateMessage(@Payload ChatMessage message) {
        messageService.saveMsg(message);
        messagingTemplate.convertAndSendToUser(
                String.valueOf(message.getReceiverId()),
                "/private",
                message
        );
    }

}
