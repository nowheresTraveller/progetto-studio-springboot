package com.nowherestraveller.progettostudio.test.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

    public static void main(String[] args) {
//        System.out.println("- pattern match  : "+ Pattern.matches("[ac][iu][xa][op]","ciao"));
//        System.out.println("- second pattern match  : "+Pattern.matches("[a-ci-p]","ap"));
//        System.out.println("- third pattern match  : "+Pattern.matches("a|c","ap"));


//        String text = "<span>a</span>testo<span>b</span>altro testo<span>c</span>";
//        Pattern pattern = Pattern.compile("<span>([^<]+)</span>");
//        Matcher matcher = pattern.matcher(text);
//        while(matcher.find()) {
//            System.out.println("Sottosequenza : "+matcher.group());
//            System.out.println("Sottogruppo 1 : "+matcher.group(1));
//        }

//        //prova 1:
//        String text2 = "ciao mondo. tutto bene";
//        Pattern pattern2 = Pattern.compile("ciao mondo");
//        Matcher matcher2 = pattern2.matcher(text2);
//        while (matcher2.find()) {
//            System.out.println("Sottosequenza : " + matcher2.group());
//        }
//
//        //prova 2:
//        System.out.println (matcher2.matches());

        //prova 3:
        System.out.println("- pattern match  : "+ Pattern.matches("c|o","c"));

        //[abc] uguale ad a|b|c
        //[a-z0-9]
        //[^a-z] ---> il testo devo contenere tutti carattere tranne quelli da a-z
        //[$] --> cerca il carattere $. Non serve il carattere di escape '\'
        //. --> tutti i caratteri
        //a{3} --> il pattern è una stringa che indica che il testo deve contenere almeno 3 a consecutive
        //a{3,4} --> il pattern è una stringa che indica che il testo deve contenere minimo 3 a e massimo 4 a
        //a{3,} --> il pattern è una stringa che indica che il testo deve contenere minimo 3 a fino all'infinito
        //[ab]{3,4} -->//a{3,4} --> il pattern è una stringa che indica che il testo deve contenere una combinazione di caratteri a,b
        //                          che forma una stringa di 4 caratteri
        //(ciao) --> Il patter è una stringa che indica che il testo deve contenere ciao. Con le parentesi tonde si
//                     indica che ciao è un gruppo
        //([a-c]+) --> Il pattern è un gruppo che rappresenta una o più occorrenza di una lettera tra a e c.
        //(?:[0-9]+) --> gruppo "non capting"
        //(ciao)(mondo) \1 --> back reference al primo gruppo (si fà il doppione)
        // \1ciao|(mano) --> il back capture su mano in questo caso funzione(forse perchè c'è l'or)

    }

}