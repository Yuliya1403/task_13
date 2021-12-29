package com.max.idea;

//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type = input.nextInt();
        if (type == 1) {
            System.out.println("Выберите единицу измерения: 1 - граммы, 2 - килограммы, 3 - центнер, 4 - тонна");
        } else if (type == 2) {
            System.out.println("Выберите единицу измерения:  1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int sum = input.nextInt();
        if (sum < 4) {
            System.out.println("Введите число");
        } else if (sum > 0) {
            System.out.println("Введите число");
            }
            double variable = input.nextInt();
            {
                System.out.println(variable);
            }
        }
    }






























































