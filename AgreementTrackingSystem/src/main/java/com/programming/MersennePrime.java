package com.programming;

import java.util.Scanner;

/**
 * Created by md.rahman on 1/15/2018.
 */
public class MersennePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        checkMersennePrime(input);
        //System.out.println(checkMersennePrime(input));
    }

    public static void checkMersennePrime(Integer number) {
        Boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Not a Mersenne Number");
                isPrime = false;
                break;
            }

        }
        if (isPrime) {

            Integer sum = number + 1;
            Integer square = 0;
            int m = 2;
            while (m != 0) {
                square = (int) Math.pow((double) 2, m);
                if (square.equals(sum)) {
                    m = 0;
                    System.out.println("A Mersenne Number");
                }
                if (square > sum) {
                    m = 0;
                    System.out.println("Not a Mersenne Number");
                }
                if (square < sum) {
                    m++;
                }
            }
        }


    }
}
