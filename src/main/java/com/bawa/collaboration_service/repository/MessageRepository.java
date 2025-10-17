package com.bawa.collaboration_service.repository;

import com.bawa.collaboration_service.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
