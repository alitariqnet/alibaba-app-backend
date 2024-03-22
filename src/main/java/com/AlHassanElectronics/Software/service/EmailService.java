package com.AlHassanElectronics.Software.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Date;
import java.util.Properties;

public class EmailService {
    @Value("${spring.mail.host}")
    static String host;
    @Value("${spring.mail.port}")
    static int port;
    @Value("${spring.mail.username}")
    static String username;
    @Value("${spring.mail.password}")
    static String password;

    public static void sendEmail(String message) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setPassword(password);
        mailSender.setUsername(username);
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.starttls.enable=true","true");
        mailSender.setJavaMailProperties(properties);
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("alitariq143@hotmail.com");
        mailMessage.setTo("alibaba420pk@hotmail.com");
        mailMessage.setSentDate(new Date());
        mailMessage.setSubject("test email subject");
        mailMessage.setText(message);
        mailSender.send(mailMessage);
    }
}
