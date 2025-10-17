package com.bawa.collaboration_service.util.map;

import com.bawa.collaboration_service.entity.ChatMessage;
import com.bawa.collaboration_service.entity.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChatMapper {
    Message resToEntity(ChatMessage chatMessage);
    ChatMessage resToDTO(Message message);
}
