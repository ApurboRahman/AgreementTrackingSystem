package com.programming;

/**
 * Created by ${Apurbo} on 4/27/2018.
 */
public class PizzaCutProblem {

    // Function for finding maximum pieces
    // with n cuts.
    static int findMaximumPieces(int n)
    {
        return 1 + n * (n + 1) / 2;
    }

    // Driver Program to test above function
    public static void main(String arg[])
    {

        System.out.println(findMaximumPieces(4));
    }
}