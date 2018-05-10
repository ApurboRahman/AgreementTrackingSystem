package com.programming.paiza;

/**
 * Created by ${Apurbo} on 5/7/2018.
 */
public class B012CheckDigit {
    public static void main(String[] args) {
        int sumOfEvenNumber = 0;

        int sumOfOddDigit = 0;
        int total = 0;
        String st = "511070105176715";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) % 2 == 0) {
                int doubleEven = 2 * Integer.parseInt(String.valueOf(st.charAt(i)));
                if (doubleEven > 9) {
                    doubleEven = doubleEven / 10 + doubleEven % 10;
                }
                sumOfEvenNumber += doubleEven;
            } else {
                sumOfOddDigit += Integer.parseInt(String.valueOf(st.charAt(i)));
            }
        }
        total = sumOfEvenNumber+sumOfOddDigit;
        System.out.println(total);
        System.out.println(total/10);
    }

}
