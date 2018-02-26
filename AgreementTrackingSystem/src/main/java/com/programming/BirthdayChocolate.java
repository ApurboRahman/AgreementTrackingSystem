package com.programming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by md.rahman on 2/20/2018.
 */
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {

        int result = 0;
        int equalLengthAndMonth = 0;
        for (int i = 0; i < n - m; i++) {
            if (Arrays.stream(s, i, i + m).sum() == d) {
                result++;
            }
        }
/*

        if (s.length == 1) {
            if (s[0] == d) {
                result = 1;
            } else {
                return result;
            }
        } else if (s.length == m) {
            for (int i = 0; i < s.length; i++) {
                equalLengthAndMonth = +s[i];
            }
            if (equalLengthAndMonth == d) {
                result = 1;
                return result;
            } else {
                result = 0;
                return result;
            }
        } else {

            for (int i = 0; i <= s.length - m; i++) {
                equalLengthAndMonth = 0;
                for (int j = 0; j < m; j++) {
                    if (i + j == s.length) {
                        break;
                    } else {
                        equalLengthAndMonth += s[i + j];
                    }
                }
                if (equalLengthAndMonth == d) {
                    result++;
                }
            }
        }*/
        // Complete this function
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
