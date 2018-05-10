package com.programming;

import java.util.Scanner;

/**
 * Created by ${Apurbo} on 4/7/2018.
 */
public class RectangleStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Rows to print");
        int rows = s.nextInt();
        System.out.println("Enter Number of Columns to print");
        int cols = s.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i != 1 && i != rows) {
                    if (j == 1 || j == cols) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            if (i != rows) {
                System.out.println();
            }
        }
        s.close();
    }
}
