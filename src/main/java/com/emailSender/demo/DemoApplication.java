package com.emailSender.demo;

import com.emailSender.demo.Service.EmailSendService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private EmailSendService senderService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendSimpleEmail("toEmail",
				"This is email body",
				"Hiii");
	}

}
