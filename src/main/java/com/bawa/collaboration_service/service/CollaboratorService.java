package com.bawa.collaboration_service.service;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.web.multipart.MultipartFile;

public interface CollaboratorService {
    FileUpload uploadFile(MultipartFile file, Integer menteeId, Integer mentorId);

}
