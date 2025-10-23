package com.bawa.collaboration_service.service.impl;

import com.bawa.collaboration_service.repository.CollabRepository;
import com.bawa.collaboration_service.service.CollaboratorService;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {
    @Autowired
    CollabRepository repository;

//    private final Drive googleDrive;
    @Override
    public FileUpload uploadFile(MultipartFile file, Integer menteeId, Integer mentorId) {
        return null;
    }
}
