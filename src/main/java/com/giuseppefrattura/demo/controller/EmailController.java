package com.giuseppefrattura.demo.controller;

import com.giuseppefrattura.demo.model.EmailRequest;
import com.giuseppefrattura.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/mail")
    public String sendEMail(@RequestBody EmailRequest emailRequest) {
        return emailService.sendSimpleMail(emailRequest);
    }
}
