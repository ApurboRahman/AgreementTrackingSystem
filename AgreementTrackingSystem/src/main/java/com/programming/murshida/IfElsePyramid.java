package com.programming.murshida;

/**
 * Created by ${Apurbo} on 4/14/2018.
 */
public class IfElsePyramid {
    public static void main(String[] args) {
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
      //  upperPart();
      //  lowerPart();
       // rightAlignment();
        //centreAlignment();
        pyramid();
      //  increment();
    }

    static void upperPart() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void lowerPart() {
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void rightAlignment() {
        //Printing upper half of the pattern

        for (int i = 1; i <= 7; i++) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= 7; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = 7 - 1; i >= 1; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= 7; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    static void centreAlignment() {
        //Printing upper half of the pattern

       for (int i = 1; i <= 7; i++) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= 7; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
//            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = i; j <= 7; j++) {
                for(int k = 1; k<i;k++){
                   // System.out.print("^");
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = 7 - 1; i >= 1; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= 7; j++) {
                System.out.print(j);
                System.out.print(" ");
            }


            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                System.out.print(" ");
                //System.out.print("*");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= 7; j++) {
                System.out.print(j);
                System.out.print(" ");

            }

            System.out.println();
        }
    }

    static void increment() {
        int i, j;

        for (j = 1; j <= 9; j++) {
            System.out.print(" ");
            if (j % 3 == 0) {
                System.out.println(j);
            } else
                System.out.print(j);

        }
    }

    static void pyramid(){
        for (int i = 7; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
