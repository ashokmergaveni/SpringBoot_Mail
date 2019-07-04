package com.amwater;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender {

    private String from;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String to, String subject, EventsObject body) throws MessagingException, IOException {
    	

    /*	SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo("ashokm@apporchid.com");
			mailMessage.setFrom("ashokm@apporchid.com");
			mailMessage.setSubject("Events Admin Mail");
			mailMessage.setText(body);
			javaMailSender.send(mailMessage);*/
    	
    	MimeMessage message =javaMailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");
            String htmlMsg = "<div>Event Created By : "+body.employeeName+"</div> </br>"+"<div>Event name : "+body.name+"</div> </br>"+"<div>Event Description : "+body.description+"</div>";

            message.setContent(htmlMsg, "text/html");
            helper.setFrom("ashokm@apporchid.com");

            helper.setTo("ashokm@apporchid.com");
            helper.setSubject("Events-Admin");
            javaMailSender.send(message);
    	
    }	
}