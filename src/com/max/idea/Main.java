package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            double average = 0;
            double sum = 0;
            double result = 0;
            sum += array[i];
            average = sum / array.length;
            result = array[i] * average;
            System.out.println("умножение на среднее арифметическое: " + result);
        }
    }
}


































































































































