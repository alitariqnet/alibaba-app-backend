package com.AlHassanElectronics.Software.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Properties;

@Service
public class EmailService {
    @Value("${spring.mail.host}")
    static String host;
    @Value("${spring.mail.port}")
    static int port;
    @Value("${spring.mail.username}")
    static String username;
    @Value("${spring.mail.password}")
    static String password;
    JavaMailSenderImpl mailSender = null;

    public void init() {
        if (mailSender == null) {
            mailSender = new JavaMailSenderImpl();
            mailSender.setHost(host);
            mailSender.setPort(port);
            mailSender.setPassword(password);
            mailSender.setUsername(username);
        }
    }

    public void sendEmail(String message) {
        this.init();

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.starttls.enable=true", "true");

        mailSender.setJavaMailProperties(properties);
        mailSender.send(prepareMailMessage("alitariq143@hotmail.com", "alibaba420pk@hotmail.com", "test email subject", message));
    }

    public SimpleMailMessage prepareMailMessage(String from, String to, String subject, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSentDate(new Date());
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        return mailMessage;
    }
}
