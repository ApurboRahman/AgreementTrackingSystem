package com.programming.murshida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ${Apurbo} on 4/21/2018.
 */
public class InputClass {
    public static void main(String[] args) throws IOException {
        // Declare an object and initialize with
        // predefined standard input object

        /*Scanner sc = new Scanner(System.in);


        // Initialize sum and count of input elements
        int sum = 0, count = 0;

        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);
        */
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("Enter numbers to average.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer in = Integer.parseInt(s);
        Integer ins = Integer.parseInt(br.readLine());
// Read and sum numbers.
        while (conin.hasNext()) {
            if (conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            } else {
                String str = conin.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Average is " + sum / count);
    }

}
