package com.bawa.collaboration_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private Integer senderId;
    private Integer receiverId;
    private String content;
    private Timestamp timestamp;
}
