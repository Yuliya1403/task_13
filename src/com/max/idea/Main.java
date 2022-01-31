package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate = 0;
        double rate1 = 0;
        double rate2 = 0;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type = input.nextInt();
        if (type == 1) {
            System.out.println("Выберите единицу измерения: 1 - граммы, 2 - килограммы, 3 - центнер, 4 - тонна");
            int sum = input.nextInt();
            System.out.println("Введите число");
            int sum1 = input.nextInt();
            if (sum == 1) {
                double gramm_kg_rate = 0.001;
                double gramm_centr_rate = 0.0001;
                double gramm_tonn_rate = 0.000001;
                rate = sum1 * gramm_kg_rate;
                rate1 = sum1 * gramm_centr_rate;
                rate2 = sum1 * gramm_tonn_rate;
                System.out.printf(sum1 + " грамм, равен " + rate + " киллограмм," + rate1 + " центнер," + rate2 + " тонн");
            } else if (sum == 2) {
                double kg_gramm_rate = 1000;
                double kg_centr_rate = 0.01;
                double kg_tonn_rate = 0.001;
                rate = sum1 * kg_gramm_rate;
                rate1 = sum1 * kg_centr_rate;
                rate2 = sum1 * kg_tonn_rate;
                System.out.printf(sum1 + " киллограмм, ровняется " + rate + " грамм," + rate1 + " центнер," + rate2 + " тонн");
            } else if (sum == 3) {
                double centr_gramm_rate = 100000;
                double centr_kg_rate = 100;
                double centr_tonn_rate = 0.01;
                rate = sum1 * centr_gramm_rate;
                rate1 = sum1 * centr_kg_rate;
                rate2 = sum1 * centr_tonn_rate;
                System.out.printf(sum1 + " центнер, ровняется " + rate + " грамм," + rate1 + " киллограмм," + rate2 + " тонн");
            } else if (sum == 4) {
                double tonn_gramm_rate = 1000000;
                double tonn_kg_rate = 1000;
                double tonn_centr_rate = 10;
                rate = sum1 * tonn_gramm_rate;
                rate1 = sum1 * tonn_kg_rate;
                rate2 = sum1 * tonn_centr_rate;
                System.out.printf(sum1 + " тонн, ровняется " + rate + " грамм," + rate1 + " киллограмм," + rate2 + " центнер");
            }

        } else if (type == 2) {
            System.out.println("Выберите единицу измерения:  1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int var = input.nextInt();
            System.out.println("Введите число");
            int var1 = input.nextInt();
            if (var == 1) {
                double meter_mile_rate = 0.000621;
                double meter_yard_rate = 1.09361;
                double meter_foot_rate = 3.28084;
                rate = var1 * meter_mile_rate;
                rate1 = var1 * meter_yard_rate;
                rate2 = var1 * meter_foot_rate;
                System.out.printf(var1 + " метров, равно " + rate + " миль," + rate1 + " ярд," + rate2 + " фут");
            } else if (var == 2) {
                double mile_meter_rate = 1609.34;
                double mile_yard_rate = 1760;
                double mile_foot_rate = 5280;
                rate = var1 * mile_meter_rate;
                rate1 = var1 * mile_yard_rate;
                rate2 = var1 * mile_foot_rate;
                System.out.printf(var1 + " миль, ровняется " + rate + " метров," + rate1 + " ярд," + rate2 + " фут");
            } else if (var == 3) {
                double yard_meter_rate = 0.9144;
                double yard_mile_rate = 0.000568182;
                double yard_foot_rate = 3;
                rate = var1 * yard_meter_rate;
                rate1 = var1 * yard_mile_rate;
                rate2 = var1 * yard_foot_rate;
                System.out.printf(var1 + " ярд, ровняется " + rate + " метров," + rate1 + " миль," + rate2 + " фут");
            } else if (var == 4) {
                double foot_meter_rate = 0.3048;
                double foot_mile_rate = 0.000189394;
                double foot_yard_rate = 0.333333;
                rate = var1 * foot_meter_rate;
                rate1 = var1 * foot_mile_rate;
                rate2 = var1 * foot_yard_rate;
                System.out.printf(var1 + " фут, ровняется " + rate + " метров," + rate1 + " миль," + rate2 + " ярд");
            }
        }
    }
}




















































































































