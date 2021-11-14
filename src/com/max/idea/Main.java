package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5}; // Задание 1
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                average = sum / array.length;// Задание 2
                System.out.println(array[i] * average); //Задание 3
            }
        }
    }
}





















