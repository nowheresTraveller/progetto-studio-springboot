package com.nowherestraveller.progettostudio.test.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest {
   private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public static void main(String[] args) {
        MyLogClass.setup();
        // quando l'oggetto logger è settato a INFO, si fanno anche i log di severe e warning
        logger.info("Inizio file log!");
        logger.severe("ciao");
        logger.warning("mondo");

        // quando l'oggetto logger è settato a SEVERE, si fanno solo i log di SEVERE
        logger.setLevel(Level.SEVERE);
        logger.severe("Ho settato il logger a severe!, buonasera");

        //TODO limitare gli handler all'oggetto logger
        //TODO Fare formattazione


    }

}
