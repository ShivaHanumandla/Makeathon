package hack.infy.controller;

import hack.infy.resolvertemplate.ReportTemplateEngine;
import hack.infy.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MailController {
    @Autowired
    MailService mailService;

    @GetMapping(path = "/sendmail")
    public String sendmail(){
        mailService.sendMail();
        return "mailsent";
    }


    @GetMapping(path = "/sendmail2")
    public String sendmail2(){
        String sub="Test";
        String message1="world";
        String mailbody="Hello "+message1+ " \n Spring Boot Email";
        mailService.sendMail(mailbody,sub,"vamsithumati11@gmail.com");
        return "mailsent";
    }

    @Autowired
    ReportTemplateEngine reportTemplateEngine;
    @GetMapping(path = "template")
    public String getTemplate(){
       String temp =  "<h1 th:text='${message}'>A message will go here!</h1>";
       String xxx  = reportTemplateEngine.getTemplateFromMap(temp,"vamsi");
       return xxx;
    }
}
