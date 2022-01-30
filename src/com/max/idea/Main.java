package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите ширину матрицы");
        int width = input.nextInt();

        System.out.println("Введите высоту матрицы");
        int height = input.nextInt();

        int[][] matrix = new int[width][height];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print("Введите элементы матрицы " + i + ", " + j);
                matrix[i][j] = input.nextInt();
            }
        }

        for(int l = 0; l < matrix[0].length; l++) {
            System.out.println(matrix[0][l] * 3);
        }

    }
}





















































































































