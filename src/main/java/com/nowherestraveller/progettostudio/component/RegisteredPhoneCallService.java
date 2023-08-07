package com.nowherestraveller.progettostudio.component;

import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class RegisteredPhoneCallService implements MessageService {
    @Override
    public String sendMessage() {
        return "I'm sending the message ...... through a registered phone call!";
    }
}
