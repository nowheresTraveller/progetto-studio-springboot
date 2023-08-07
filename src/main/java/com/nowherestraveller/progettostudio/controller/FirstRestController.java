package com.nowherestraveller.progettostudio.controller;

import com.nowherestraveller.progettostudio.component.Automobile;
import com.nowherestraveller.progettostudio.component.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    @Value("${miaproprieta.nomeapplicazione}")
    private String miaProprieta;

    //field injection
    @Autowired
    private MessageSender messageSender;
    @Autowired
    private Automobile automobile;
//    @Autowired
//    private Moto moto;

    @GetMapping("/getP")
    public String getP(){
        return this.miaProprieta;
    }

    @GetMapping("/sendAMessage")
    public String sendAMessage(){
        return messageSender.send();
    }

    @GetMapping("/getDatiAutomobile")
    public String getDatiAutomobile(){
        return automobile.getMarchio() +" "+automobile.getModello() ;
    }

//    @GetMapping("/getInfoMoto")
//    public String getInfoMoto(){
//        return "metodo creante: "+moto.getCreator()+", data creazione: "+moto.getCreatedAt().toString();
//    }

}
