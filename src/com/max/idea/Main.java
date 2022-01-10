package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввести первое  число");
        int type = input.nextInt();
        String str = Integer.toString(type);
        //System.out.println(str + 2); для проверки, что число преобразовалось
        System.out.println("Ввести второе  число");
        int type2 = input.nextInt();
        int resultInt = Math.max(type,  type2);
        System.out.println("Большее число:" + resultInt);
        int resultInt2 = Math.min(type, type2);
        double str2 = Double.valueOf(resultInt2);
        System.out.println("Меньшее число:" + str2);



        }
    }


















































































