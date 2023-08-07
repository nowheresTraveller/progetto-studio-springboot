package com.nowherestraveller.progettostudio.configuration;

import com.nowherestraveller.progettostudio.component.Automobile;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class FirstConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    @Bean
    public Automobile getFirstAutomobile() {
        return new Automobile("Fiat", "Punto");
    }

    //@Primary da precedenza ad un bean rispetto ad un altro dello stesso tipo
    @Bean
    @Primary
    public Automobile getSecondAutomobile() {
        return new Automobile("Mercedes", "Classe-A");
    }


    //Permette di eseguire qualcosa  qualcosa  dopo l'avviamento dell'applicazione spring boot (nel mio caso ho stampato una cosa nella console)
//    @Bean
//    public CommandLineRunner commandLine() {
//        return runner -> {
//            System.out.println("Benvenuto nell'applicazione");
//        };
//
//    }


}




