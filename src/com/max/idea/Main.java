package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 14;
        int z = 12;
        int[] nums = {x,y,z}; //Задание 1
        int result = 0;
        for (int m : nums)
            result += m;
        //System.out.println("Значение среднего арифметического равно:" + result / nums.length); //Задание 2
        int mid_index = (int)Math.floor((result / nums.length)/2); // Задание 3
        if (mid_index > 3){
            System.out.println("Программа выполнена корректно");}// Задание 4

    }
    }





