package com.nowherestraveller.progettostudio.test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class LambdaExpressionTest {

    public static void main(String[] args) {
        Runnable macchina = () -> {
            System.out.println("L'auto è partita!");
        };

        macchina.run();
        Comparable r = x -> {
            return ((Integer) x) + 2;
        };

        Predicate<Integer> p = value ->
                     value == 2;

        System.out.println(AUtileClass.doCompareTo(r));
        System.out.println("Test 1 : " + p.test(2));
        System.out.println("Test 2 : " +p.test(4));

        //TOdo fare regular expression e Logging
        //TODO studiare classe per gestire file


        Object o= new Scanner(System.in);
        System.out.println(o.getClass());

//        try{
//            throw new NullPointerException();
//        }catch(Exception e){
//            System.out.println(e.getClass());
//        }




    }


}
