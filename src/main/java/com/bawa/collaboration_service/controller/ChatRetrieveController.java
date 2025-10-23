package com.bawa.collaboration_service.controller;

import com.bawa.collaboration_service.dto.res.StandardResponse;
import com.bawa.collaboration_service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chat")
@CrossOrigin(origins = "${cross.origins}", allowedHeaders = "${cross.allowedHeaders}")
public class ChatRetrieveController {
    @Autowired
    MessageService messageService;

    @GetMapping("")
    public ResponseEntity<StandardResponse> getChatByIds(
            @RequestParam Integer mentorId, @RequestParam Integer menteeId
    ){
        return new ResponseEntity<>(
                new StandardResponse("Success",messageService.getMessagesByIds(mentorId, menteeId)), HttpStatus.OK
        );
    }
}
