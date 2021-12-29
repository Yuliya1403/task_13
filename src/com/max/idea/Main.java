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
            int sum = input.nextInt();
            if (sum < 4) {
                System.out.println("Введите число");
            } else if (sum > 0) {
                System.out.println("Введите число");
            }
            double gr = 0;
            double centner = 0;
            double tonn = 0;
            double kg = 0;
            double variable = input.nextInt();
            gr = kg * 0.001;
            centner = kg * 100;
            tonn = kg * 1000;
            System.out.printf("килограмм:" + variable + " граммы:" + gr + " центнер:" + centner + " фут:" + tonn);


        } else if (type == 2) {
            System.out.println("Выберите единицу измерения:  1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int sum = input.nextInt();
        if (sum < 4) {
            System.out.println("Введите число");
        } else if (sum > 0) {
            System.out.println("Введите число");
            }
        double milles = 0;
        double yard = 0;
        double foot = 0;
            double variable = input.nextInt();
        milles = variable * 0.62;
        yard = variable * 1.09;
        foot = variable * 3.28;
                System.out.printf("метры:" + variable + " милли:" + milles + " ярд:" + yard + " фут:" + foot);
            }
        }































































