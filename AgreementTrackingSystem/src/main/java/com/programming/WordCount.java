package com.programming;

import java.util.*;

/**
 * Created by ${Apurbo} on 4/27/2018.
 */
public class WordCount {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.replaceAll("\\.", "");
        line = line.replaceAll("\\,", "");
        System.out.println(line);
        if (line != null && !line.isEmpty()) {
            String[] wordArray = line.trim().split("\\s+");
            Map<String, Integer> map = wordCount(wordArray);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : strings) {

            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }
}
