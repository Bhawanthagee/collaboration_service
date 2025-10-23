package com.bawa.collaboration_service.repository;

import com.bawa.collaboration_service.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Integer> {
    @Query(
            value = """
            SELECT * FROM message
            WHERE sender_id = :mentorId AND receiver_id =:menteeId       
            OR sender_id = :menteeId AND receiver_id =:mentorId    
                    
            """,nativeQuery = true
    )
    List<Message> getMessagesForMentor(@Param("mentorId") Integer mentorId,@Param("menteeId") Integer menteeId);
}
