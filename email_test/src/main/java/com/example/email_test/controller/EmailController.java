package com.example.email_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmailController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/email")
    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("lilijklilijk@gmail.com");
        message.setTo("kbjinco@gmail.com", "lilijklilijk@gmail.com");
        String subject = "Rejected";
        String content = "Your return has been rejected";
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);

        return "form";
    }
}
