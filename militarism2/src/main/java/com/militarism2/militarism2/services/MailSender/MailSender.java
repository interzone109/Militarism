package com.militarism2.militarism2.services.MailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * Сервис отправки Email
 */
@Service
public class MailSender {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String username;


    public void send(String emailTo, String subject, String strmessage) {
    	
    	MimeMessage message = mailSender.createMimeMessage();
    	 
        boolean multipart = true;
        try {
        MimeMessageHelper helper = new MimeMessageHelper(message, multipart, "utf-8");
        
        
		message.setContent(strmessage, "text/html");
		
        
        helper.setFrom(username);
        
        helper.setTo(emailTo);
         
        helper.setSubject(subject);
        
        } catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        mailSender.send(message);
    }
}