package com.programming.murshida;

import java.util.Formatter;

/**
 * Created by ${Apurbo} on 5/7/2018.
 */
public class StringClass {
    public static void main(String[] args) {
        String output = String.format("%s = %d", "Year", 41);
        System.out.printf(output);
        System.out.printf("My name is: %s%n", "joe");
        StringBuilder sbuf = new StringBuilder();

        Formatter fmt = new Formatter(sbuf);

        fmt.format("PI = %f%n", Math.PI);

        System.out.print(sbuf.toString());

        System.out.print(String.format("%3$s", 32, "Hello",7));
        System.out.println(String.format("%d", 93)); // prints 93
        System.out.println(String.format("|%20d|", 93)); // prints: |                  93|
        System.out.println(String.format("|%-20d|", 93)); // prints: |93       );


        String string = "Amar Sonar Bangla. Ami tomai valobashi";

        System.out.println(string.substring(5));
        System.out.println(string.substring(3,14));
        System.out.println(string.contains("Am"));
        System.out.println(String.join("-",string));
        String message = String.join("-", string,string);

        System.out.println(message);
        System.out.println(string.replace("Am","cd"));
    }
}
