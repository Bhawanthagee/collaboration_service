package com.bawa.collaboration_service.repository;

import com.bawa.collaboration_service.entity.Collaboration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollabRepository extends JpaRepository<Collaboration,Integer> {
}
