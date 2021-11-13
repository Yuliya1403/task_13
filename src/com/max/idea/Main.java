package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int type = 2;
      String typeString = null;
        switch (type) {
            case 1 : typeString = "Масса";
                break;
            case 2 : typeString = "Расстояние";
                break;
        }
           System.out.println(typeString); //Задание 1

        int unit = 1;
        String unitString = null;
        switch (unit) {
            case 1:
                unitString = "Метр";
                break;
            case 2:
                unitString = "Миля";
                break;
            case 3:
                unitString = "Ярд";
                break;
            case 5:
                unitString = "Фут";
                break;
        }
            System.out.println(unitString);//Задание 2
        int x = 10;
        String answer = null;
        if (x == 10)
            answer = "Метры: 10 , Мили: 0.006, Ярды: 10.94, Футы: 32.81";
        else
            answer = "Неверный ответ";
            System.out.println(answer);//Задание 3
        }

        }








