package com.nowherestraveller.progettostudio.test.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogClass {

    private static FileHandler fileTxt;
    private static SimpleFormatter formatterTxt;


    public static void setup(){
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.setLevel(Level.INFO);
        try {
            fileTxt=new FileHandler("/home/giovanni/miei-progetti-springboot/progetto-studio-springboot/src/main/resources/logging/mioLog.txt");
            formatterTxt=new SimpleFormatter();
            fileTxt.setFormatter(formatterTxt);
            logger.addHandler(fileTxt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
