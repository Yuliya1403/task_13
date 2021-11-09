package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
            byte array [] = {1, 2, 3, 4, 5}; // Задание 1
        byte temp = array [0];
        array [0]=array [4];
        array [4]= temp; // Задание 2

    System.out.println (array [0]+ array[2]) ; // Задание 3
    }
}
