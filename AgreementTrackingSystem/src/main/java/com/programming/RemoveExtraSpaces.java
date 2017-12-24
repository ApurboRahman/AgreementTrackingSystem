package com.programming;

/**
 * Created by md.rahman on 12/20/2017.
 */
public class RemoveExtraSpaces {

    public static void main(String[] args) {
        String[] tests = {
                "  x  ",          // [x]
                "  1   2   3  ",  // [1 2 3]
                "",               // []
                "   ",            // []
                "I    am     Anvesh   Patel",
                "Database   Research and     Development  ",
                "Database    Administrator     ",
                "Learning    BIGDATA    and       NOSQL ",
        };
        for (String test : tests) {
            System.out.format("%s%n",
                    test.replaceAll("^ +| +$|( )+", "$1")
            );
        }
    }
}
