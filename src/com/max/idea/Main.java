package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char us_dollar_sym = 36;
        char rub_sym = 82;
        String us_dollar = "Доллары";
        String rub = "Рубли";
        double rate = 0;
        Scanner in = new Scanner(System.in);
        String inType = null;
        System.out.printf("Введите курс доллара ");
        double dollar = in.nextDouble();

        System.out.printf("Введите сумму в рублях ");
        double input = in.nextDouble();

        {
            rate = input / dollar;
            System.out.printf( "%s" + input + " %s = %.2f\n", (char)rub_sym , us_dollar, rate);
        }
    }
}
































































































































