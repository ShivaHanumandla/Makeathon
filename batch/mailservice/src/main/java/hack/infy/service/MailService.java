package hack.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public String sendMail(){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("abhtri2009@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");
        try {
            javaMailSender.send(msg);
            return "sent";
        }catch (Exception e){
            return "failure";
        }
    }

    public String sendMail(String mailBody,String subject, String receiver){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(receiver);
        msg.setSubject(subject);
        msg.setText(mailBody);
        try {
            javaMailSender.send(msg);
            return "sent";
        }catch (Exception e){
            return "failure";
        }
    }
}
