package com.nowherestraveller.progettostudio.component;

import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{
    private MessageService messageService;


    public String sendMessage(){
        return "I'm sending the message ...... from an email provider!";
    }
}
