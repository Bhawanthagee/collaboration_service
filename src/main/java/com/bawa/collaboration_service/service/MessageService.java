package com.bawa.collaboration_service.service;

import com.bawa.collaboration_service.entity.ChatMessage;

public interface MessageService {
    void saveMsg(ChatMessage message);
}
