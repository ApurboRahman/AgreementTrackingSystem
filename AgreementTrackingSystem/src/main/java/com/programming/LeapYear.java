package com.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by md.rahman on 3/24/2018.
 */
public class LeapYear {
    static long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

    public static void main(String arg[]) throws IOException {
        System.out.println("before Used Mem " + beforeUsedMem);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if (isLeapYear(input)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long actualMemUsed = afterUsedMem - beforeUsedMem;
        System.out.println("before Used Mem " + beforeUsedMem);
        System.out.println("after Used Mem " + afterUsedMem);
        System.out.println("actual Mem Used " + actualMemUsed);
    }

    public static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
