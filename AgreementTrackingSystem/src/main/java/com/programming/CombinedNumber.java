package com.programming;

/**
 * Created by md.rahman on 6/21/2018.
 */
public class CombinedNumber {
    static int i = 1;

    static {
        i = i-- + --i;
    }

    {
        i = i++ - ++i;
    }

    public static void main(String[] a) {
        System.out.println(new CombinedNumber().methodOfTest());
        int[] ar = {5, 9, 50, 1, 2};
        String combinedNumber = "";
        String addFirst;
        String addLast;
        for (int i = 0; i < ar.length; i++) {
            addFirst = String.valueOf(ar[i]) + combinedNumber;
            addLast = combinedNumber + String.valueOf(ar[i]);

            if (addFirst.compareTo(addLast) > 1) {
                combinedNumber = addFirst;
            } else {
                combinedNumber = addLast;
            }
        }
        System.out.println(combinedNumber);

    }

    int methodOfTest() {
        return i + i - i * i / i;
    }
}
