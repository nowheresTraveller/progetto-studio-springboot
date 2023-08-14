package com.nowherestraveller.progettostudio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadAFileTest {
    public static void main(String[] args) {
        try {

            File file = new File ("/home/giovanni/miei-progetti-springboot/testo_prova.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            List<String> result= new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) { //esempio con un ciclo while
                result.add(line);
            }

            for(String rowText : result){
                System.out.println(rowText);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Todo imparare a scrivere in un file e creare un file da 0

    }
}
