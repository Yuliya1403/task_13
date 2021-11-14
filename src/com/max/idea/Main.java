package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 2;
        int[] arrays = {1, 4, 2};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == x || arrays[i] == y || arrays[i] == z) {
                continue;
            }
            for (int i2 = 0; i2 < arrays.length; i2++) {
                if (arrays[i2] == x || arrays[i2] == y || arrays[i2] == z) {
                    continue;
                }
                for (int i3 = 0; i3 < arrays.length; i3++) {
                    if (arrays[i3] == x || arrays[i3] == y || arrays[i3] == z) {
                        continue;
                    }
                }
            }
        }
        System.out.println("Данное значение имеется в константах");
    }
}















