package com.sunjray.osdma.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.sunjray.osdma.constants.AppConstants;
import com.sunjray.osdma.constants.MailResponse;

@Component
@PropertySource("classpath:emailServices.properties")
public class MailSenderService {

	@Autowired(required = true)
	private MailSender mailSender;
	@Autowired(required = true)
	private Environment environment;

	public MailResponse sendMail(String from,String to,String cc, String subject, String content,List attachments) 
	{
		MailResponse response = new MailResponse();
		SimpleMailMessage message = new SimpleMailMessage();
		
		try {
			
				message.setFrom(environment.getProperty(AppConstants.USERNAME));
				message.setTo(to);
				message.setSubject(subject);
				message.setText(content);
				
			//	 message.setContent("text/html");
		
			mailSender.send(message);
			response.setStatus("Success");
			response.setErrorCode("0000");
		} catch (Exception e) {
			response.setStatus(e.getLocalizedMessage());
			response.setErrorCode("9999");
		}
		return response;
	}
}

