package com.max.idea;

//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x ;
        int y ;
        int z ;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter tree numbers: ");
        x = reader.nextInt();
        y = reader.nextInt();
        z = reader.nextInt(); // Задание 1
        {
            int [] nums = {x,y,z};
            int result = 0;
            for (int m : nums)
                result += m;
            System.out.println("Значение среднего арифметического равно:" + result / nums.length);// Задание 2
            int mid_index = (int)Math.floor((result / nums.length)/2); // Задание 3
            if (mid_index > 3){
                System.out.println("Программа выполнена корректно");}// Задание 4
            }
        }
    }







































