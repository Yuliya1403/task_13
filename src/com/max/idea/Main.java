package com.max.idea;

//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers length: ");
        double numbers[] = new double[input.nextInt()];
        System.out.println("Insert numbers elements: ");
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = input.nextDouble();
            System.out.print("Inserted array elements:");
        }
        {
            double average = 0;
            if (numbers.length > 0) {
                double sum = 0;
                double result = 0;
                for (int g = 0; g < numbers.length; g++) {
                    sum += numbers[g];
                }
                average = sum / numbers.length;
                for (int f = 0; f < numbers.length; f++) {
                    result = numbers[f] * average;
                    System.out.println("умножение на среднее арифметическое" + result);
                }
            }
        }
    }
}






















































