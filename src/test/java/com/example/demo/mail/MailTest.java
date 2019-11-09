package com.example.demo.mail;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

	@Autowired
	JavaMailSender mailSender;
	
	@Test
    public void tes01() {
    	SimpleMailMessage message = new SimpleMailMessage();
    	message.setSubject("20191020");
    	message.setText("今天下雨了");
    	message.setFrom("593081343@qq.com");
    	message.setTo("593081343@qq.com");
    	mailSender.send(message);
    }
	
	@Test
    public void test02() {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message,true);
			helper.setSubject("20191020");
			helper.setText("今天下雨了");
			helper.setFrom("593081343@qq.com");
			helper.setTo("593081343@qq.com");
			
			helper.addAttachment("1.jpg", new File("C:/Users/Administrator/Desktop/aa.jpg"));
			
			mailSender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
    	 
    	
    	
    }

}
