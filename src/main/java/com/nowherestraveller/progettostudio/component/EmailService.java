package com.nowherestraveller.progettostudio.component;

import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


//@Lazy --> permette la lazy initialization
@Component("emailService")
@Lazy
public class EmailService implements MessageService{
    private MessageService messageService;


    public String sendMessage(){
        return "I'm sending the message ...... from an email provider!";
    }
}
