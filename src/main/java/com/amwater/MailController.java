package com.amwater;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MailController {

@Autowired
SmtpMailSender smtpMailSender;

@RequestMapping(path = "/api/mail/send")
public String sendMail(@RequestBody EventsObject eob) throws MessagingException, IOException {
	ObjectMapper mapper = new ObjectMapper();
	// Java object to JSON string
  smtpMailSender.sendMail("test mail by java API", "testmail", eob);
    return "succcess";
}
}