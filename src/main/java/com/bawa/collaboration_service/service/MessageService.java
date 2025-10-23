package com.bawa.collaboration_service.service;

import com.bawa.collaboration_service.entity.ChatMessage;
import com.bawa.collaboration_service.entity.Message;

import java.util.List;

public interface MessageService {
    void saveMsg(ChatMessage message);

    List<Message> getMessagesByIds(Integer mentorId, Integer menteeId);
}
