package com.nowherestraveller.progettostudio.component;


import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender  {

    private MessageService messageService;

    //setter injection
    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService){
        this.messageService=messageService;
    }

    public String send(){
        return messageService.sendMessage();
    }
}
