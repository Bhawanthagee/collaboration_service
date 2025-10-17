package com.bawa.collaboration_service.service.impl;

import com.bawa.collaboration_service.entity.ChatMessage;
import com.bawa.collaboration_service.entity.Message;
import com.bawa.collaboration_service.repository.MessageRepository;
import com.bawa.collaboration_service.service.MessageService;
import com.bawa.collaboration_service.util.map.ChatMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {
    @Autowired
    ChatMapper chatMapper;
    @Autowired
    MessageRepository messageRepository;


    @Override
    public void saveMsg(ChatMessage messageReq) {
        log.info("inside save message method");
        Message message = chatMapper.resToEntity(messageReq);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));

        messageRepository.save(message);


        log.info("message:{}",message.toString());

    }
}
