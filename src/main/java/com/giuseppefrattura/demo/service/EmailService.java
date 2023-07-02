package com.giuseppefrattura.demo.service;

import com.giuseppefrattura.demo.model.EmailRequest;

// Interface
public interface EmailService {

    String sendSimpleMail(EmailRequest details);

}