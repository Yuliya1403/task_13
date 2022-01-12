package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str = "I love java 8 Я люблю java 14 core1";
        int count = 0;
        String result;
        //String result;
        str = str.replaceAll("[а-яА-Я\\d]", "");
        result = str.replaceAll("[\\s] +", " ");
        System.out.println(result);
            if (result.length() != 0) {
                count++;
                for ( int i = 0;i < result.length();i++) {
                    if (result.charAt(i) == ' ') {
                        count++;
                    }
                }
            }
        System.out.println( count + " слов");
    }
}






















































































