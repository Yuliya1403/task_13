package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result = 0;
        char smb;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        smb = reader.next().charAt(0);
        switch (smb) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result= num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.printf("Делить на ноль нельзя");
                    System.exit(0);
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                System.exit(0);;
        }
            System.out.print("\nThe result is given as follows:\n");
            System.out.printf(num1 + " " + smb + " " + num2 + " = " + result);
        }
    }



























































































































