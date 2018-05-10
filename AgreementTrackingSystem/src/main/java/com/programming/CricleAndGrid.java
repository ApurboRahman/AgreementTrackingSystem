package com.programming;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/**
 * Created by ${Apurbo} on 4/28/2018.
 */
public class CricleAndGrid {

    private static long Latitude(double r){
        if(r<100){
            int str = (int) Math.ceil(r);
            int result = (int) (4*(str*str));
            return result;
        }
        int cel = (int) Math.ceil(r);
     long s = 0;
        for(int i = 1; i<=cel; i++) {
            s+=(int)sqrt(r*r-i*i);

        }
        s*=4;
        s+=1+4*r;
        return s;
    }


    // Driver code
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(Latitude(r));

    }
}
