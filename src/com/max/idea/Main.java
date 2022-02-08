package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int result = 0;
        int num1;
        int num2;
        char smb;
        num1 = ((int) (Math.random() * 9));
        num2 = ((int) (Math.random() * 9));
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите тип уравнения: 1 - x в начале, 2 - x в середине, 3 - x в равенстве");
        int type = input.nextInt();
        if (type == 1) {
            System.out.print("\nВведите знак (+, -): ");
            smb = input.next().charAt(0);
            switch (smb) {
                case '+':
                    result = num2 - num1;
                    break;
                case '-':
                    result = num1 + num2;
                    break;
                default:
                    System.out.printf("Неккоректно введены данные");
            }

            System.out.println("первое число равно:" + num1 + " второе число равно:" + num2 + ", результат:" + result);

        }
        if (type == 2) {
            System.out.print("\nВведите знак (+, -): ");
            smb = input.next().charAt(0);
            switch (smb) {
                case '+':
                    result = num2 - num1;
                    break;
                case '-':
                    result = num1 + num2;
                    break;
                default:
                    System.out.printf("Неккоректно введены данные");
            }

            System.out.println(" первое число равно:" + num1 + " второе число равно:" + num2 + ", результат:" + result);

        }
        if (type == 3) {
            System.out.print("\nВведите знак (+, -): ");
            smb = input.next().charAt(0);
            switch (smb) {
                case '+':
                    result = num2 + num1;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                default:
                    System.out.printf("Неккоректно введены данные");
            }

            System.out.println("первое число равно:" + num1 + " второе число равно:" + num2 + " результат:" + result);
        }
    }
}




































































































































