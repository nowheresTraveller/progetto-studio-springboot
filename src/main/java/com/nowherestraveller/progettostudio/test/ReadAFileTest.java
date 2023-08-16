package com.nowherestraveller.progettostudio.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAFileTest {
    public static void main(String[] args) {
        try {

            File file = new File("/home/giovanni/miei-progetti-springboot/testo_prova_lettura.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            List<String> result = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) { //esempio con un ciclo while
                result.add(line);
            }

            for (String rowText : result) {
                System.out.println(rowText);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
