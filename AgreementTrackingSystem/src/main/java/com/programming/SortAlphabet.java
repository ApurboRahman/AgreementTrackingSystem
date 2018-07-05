package com.programming;

/**
 * Created by md.rahman on 1/22/2018.
 */
public class SortAlphabet {
    public static void main(String[] args) {
        String st = "#R%Fg^h*T&e#@r!";
        String alphabet = "";
        String special = "";

        for (int i = 0; i < st.length(); i++) {
            int ascII = (int) st.charAt(i);
            if (ascII > 64 && ascII < 91) {
                alphabet = alphabet.concat(String.valueOf(st.charAt(i)));
            } else if (ascII > 97 && ascII < 123) {
                alphabet = alphabet.concat(String.valueOf(st.charAt(i)));
            } else {
                special = special.concat(String.valueOf(st.charAt(i)));
            }

            /*
            if (Character.isLetter(st.charAt(i))) {
                alphabet = alphabet.concat(String.valueOf(st.charAt(i)));
            } else {
                special = special.concat(String.valueOf(st.charAt(i)));
            }*/
        }

        st = alphabet.concat(special);
        System.out.println(st);
    }
}
