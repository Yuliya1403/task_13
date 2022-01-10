package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean result;
        boolean result2;
        boolean result3;
        String result4;
        String result5;
        String str = "I like Java!!!";
        result = str.contains("Java");
        result2 = str.startsWith("I like");
        result3 = str.endsWith("!!!");
        if (result == true && result2 == true && result3 == true)
        System.out.println(str.toUpperCase());
        result4 = str.replace("a","o");
        result5 = result4.substring(7, 11);
        System.out.println(result5);
    }
}



















































































