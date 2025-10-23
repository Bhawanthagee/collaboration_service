package com.bawa.collaboration_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chat")
@CrossOrigin(origins = "${cross.origins}", allowedHeaders = "${cross.allowedHeaders}")
public class CollaboratorController {

}
