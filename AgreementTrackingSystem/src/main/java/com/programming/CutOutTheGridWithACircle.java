package com.programming;

import java.util.Scanner;

/**
 * Created by ${Apurbo} on 4/27/2018.
 */
public class CutOutTheGridWithACircle {
    /*public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        Double line = sc.nextDouble();
        System.out.print(getSquare(line));
    }

    private static Integer getSquare(Double radious){
        if (radious==1){
            return 4;
        }else {
            int str = (int) Math.ceil(radious);
            int result = (int) (4*(str*str));
            return result;
        }
    }
    */
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        Double line = sc.nextDouble();
        System.out.print(getSquare(line));
    }

    private static Integer getSquare(Double radious){
        if (radious<100){
            int str = (int) Math.ceil(radious);

            return  (int) (4*(str*str));
        }else {
            // int str = (int) Math.ceil(radious);
            int result = (int) (4*(radious*radious));
            return result;
        }
    }
}
