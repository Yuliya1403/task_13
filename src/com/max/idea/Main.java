package com.max.idea;

//import java.sql.SQLOutput;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        char plus;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        System.out.print("\nEnter an operator (+: ");
        plus = reader.next().charAt(0);
        switch (plus) {
            case '+':
                sum = num1 + num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
               return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + plus + " " + num2 + " = " + sum);
    }
}































