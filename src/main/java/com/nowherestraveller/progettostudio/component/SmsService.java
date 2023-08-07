package com.nowherestraveller.progettostudio.component;

import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
    @Override
    public String sendMessage() {
        return "I'm send the message ...... from a smartphone";
    }

}
