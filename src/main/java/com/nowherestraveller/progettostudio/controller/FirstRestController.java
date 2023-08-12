package com.nowherestraveller.progettostudio.controller;

import com.nowherestraveller.progettostudio.component.Automobile;
import com.nowherestraveller.progettostudio.component.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/getHome")
    public ModelAndView getHome(){
        return new ModelAndView("home");
    }

    @GetMapping("/getNum/{num}")
    public int getNum(@PathVariable("num") Integer num){
        return num;
    }

    @GetMapping("*")
    public String fallBack(){
        return "errore";
    }
//    @GetMapping("/getInfoMoto")
//    public String getInfoMoto(){
//        return "metodo creante: "+moto.getCreator()+", data creazione: "+moto.getCreatedAt().toString();
//    }

}
