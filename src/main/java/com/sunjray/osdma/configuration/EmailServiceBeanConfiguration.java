package com.sunjray.osdma.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.sunjray.osdma.constants.AppConstants;

@Configuration
@ComponentScan(value = "com.nucigent.osdma.*")
@PropertySource("classpath:emailServices.properties")
public class EmailServiceBeanConfiguration {
	@Autowired(required = true)
	private Environment environment;

	@Bean(name = { "mailSender", "mailSenderReference" })
	public MailSender getMailSenderImpl() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(environment.getProperty(AppConstants.HOST));
		mailSender.setPort(Integer.parseInt(environment
				.getProperty(AppConstants.PORT_NO)));
		mailSender.setUsername(environment.getProperty(AppConstants.USERNAME));
		mailSender.setPassword(environment.getProperty(AppConstants.PASSWORD));
		mailSender.setJavaMailProperties(getMailProperties());
		return mailSender;
	}

	private Properties getMailProperties() {
		Properties javaMailProperties = new Properties();
		javaMailProperties.setProperty(AppConstants.PROTOCOL,
				environment.getProperty(AppConstants.PROTOCOL));
		javaMailProperties.setProperty(AppConstants.AUTH,
				environment.getProperty(AppConstants.AUTH));
		javaMailProperties.setProperty(AppConstants.DEBUG,
				environment.getProperty(AppConstants.DEBUG));
		javaMailProperties.setProperty(AppConstants.STARTTLS,
				environment.getProperty(AppConstants.STARTTLS));
		javaMailProperties.setProperty(AppConstants.SSL_FACTORY,
				environment.getProperty(AppConstants.SSL_FACTORY));
		return javaMailProperties;
	}
}
