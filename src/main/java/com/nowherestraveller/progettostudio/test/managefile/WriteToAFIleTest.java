package com.nowherestraveller.progettostudio.test.managefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFIleTest {
    public static void main(String[] args) {

        //non stamperà nulla perchè la proprietà è invisibile
        System.out.println(System.getProperty("line.separator"));

        // modificare la proprietà
//      System.setProperty("line.separator", "\n");
        System.out.println("Hello"+System.lineSeparator()+"World");

        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            //sull'oggetto FileWrite, se imposto il secondo parametro a true si fà la append della scrittura
            fileWriter = new FileWriter("/home/giovanni/miei-progetti-springboot/testo_prova_scrittura.txt",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine(); //--> considera la variabile di sistema 'line.separator'
            bufferedWriter.write("buonasera");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
