package com.max.idea;

//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        num = in.nextInt();
        for (int i = 1; i <= num; i += 2) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}

































