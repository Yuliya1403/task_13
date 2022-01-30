package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 20);
        }

        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);

        int maxValueAbs = Math.abs(maxValue);
        int minValueAbs = Math.abs(minValue);

        if (maxValueAbs >= minValueAbs) {
            System.out.println(maxValueAbs);
        } else {
            System.out.println(minValueAbs);
        }

                }
            }




















































































































