package com.max.idea;

//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 10;
        int y = 12;
        int z = 2;
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        switch (size) {
            case 1: for (int i = 0; i < size; i++)
                array[i] = x;
            break;
            case 2: for (int i = 0; i < size; i++)
                array[i] = y;
                break;
            case 3: for (int i = 0; i < size; i++)
                array[i] = z;
        }
                    System.out.println("Данное значение имеется в константах");
                }
            }




























































