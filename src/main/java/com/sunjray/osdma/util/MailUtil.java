package com.sunjray.osdma.util;

import static com.sunjray.osdma.constants.Constants.emailServicePassword;
import static com.sunjray.osdma.constants.Constants.emailServicePort;
import static com.sunjray.osdma.constants.Constants.emailServiceProvider;
import static com.sunjray.osdma.constants.Constants.emailServiceUser;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	public static boolean sendMail(String email, String subject, String content) {
		boolean result = false;
		Properties properties = System.getProperties();
		Session session = Session.getDefaultInstance(properties);
		Transport transport = null;
		MimeMessage message = new MimeMessage(session);
		String status = null;

		properties.put("mail.smtp.host", emailServiceProvider);
		properties.put("mail.smtp.user", emailServiceUser);
		properties.put("mail.smtp.password", emailServicePassword);
		properties.put("mail.smtp.port", emailServicePort);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.socketFactory.fallback", "false");
		properties.put("mail.smtp.socketFactory.port", emailServicePort);
		properties.put("mail.debug", "true");
		properties.put("mail.store.protocol", "pop3");
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.debug.auth", "true");
		properties.put("mail.pop3.socketFactory.fallback", "false");

		try {
			message.setFrom(new InternetAddress(emailServiceUser));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject(subject);
			message.setText(content);
			transport = session.getTransport("smtp");
			transport.connect(emailServiceProvider, emailServiceUser, emailServicePassword);
			transport.sendMessage(message, message.getAllRecipients());
			status = "success";

		} catch (AddressException ae) {
			status = "failure";
			ae.printStackTrace();
		} catch (MessagingException me) {
			status = "failure";
			me.printStackTrace();
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		} finally {
			try {
				if (null != transport) {
					transport.close();
				}
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
