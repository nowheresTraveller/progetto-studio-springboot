package com.nowherestraveller.progettostudio.component;

import com.nowherestraveller.progettostudio.myinterface.MessageService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope --> definisce lo scope del bean
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SmsService implements MessageService {
    @Override
    public String sendMessage() {
        return "I'm send the message ...... from a smartphone";
    }

}
