package com.max.idea;

//import java.sql.SQLOutput;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        char smb;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        smb = reader.next().charAt(0);
        switch (smb) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result= num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
               return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + smb + " " + num2 + " = " + result);
    }
}































