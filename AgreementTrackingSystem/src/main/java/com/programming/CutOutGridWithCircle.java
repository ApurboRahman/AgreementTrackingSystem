package com.programming;

import java.util.Scanner;

/**
 * Created by ${Apurbo} on 4/28/2018.
 */
public class CutOutGridWithCircle {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        Double line = scanner.nextDouble();
        //System.out.println(findSquare(line));
        System.out.println(getNumbersOfGridsPainted(line));

    }

    public static int getNumbersOfGridsPainted(double radiousOfCircle) {
        int latitudeCount = 0;
        int intValueOfRadious = (int) Math.ceil(radiousOfCircle);
        int defaultLatitude = 8 * (intValueOfRadious - 1) + 4;
        for (int i = 1; i <= intValueOfRadious; i++) {
            for (int j = 1; j <= intValueOfRadious; j++) {
                int magnatudeOfCoordinate = (i * i) + (j * j);
                if (magnatudeOfCoordinate < radiousOfCircle * radiousOfCircle) {
                    latitudeCount++;
                }
            }
        }
        int totalCoordinate = 4 * latitudeCount;
        totalCoordinate += defaultLatitude;
        return totalCoordinate;
    }

    public static int findSquare(double radious) {
        /*if(radious<10){
            int str = (int) Math.ceil(radious);
            int result = (int) (4*(str*str));
            return result;
        }*/
        int count = 0;
        int rad = (int) Math.ceil(radious);
        int defaultCount = 8 * (rad - 1) + 4;
        for (int i = 1; i <= rad; i++) {
            for (int j = 1; j <= rad; j++) {
                int k = (i * i) + (j * j);
                if (k < radious * radious) {
                    count++;
                }
            }
        }
        int allCount = 4 * count;
        allCount += defaultCount;
        return allCount;
    }
}
