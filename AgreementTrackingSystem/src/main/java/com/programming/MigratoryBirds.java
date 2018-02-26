package com.programming;

import java.util.*;

/**
 * Created by md.rahman on 2/20/2018.
 */
public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> items = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            items.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            int item = 0;
            int frequency = Collections.frequency(items, i);
            if (frequency > count) {
                count = frequency;
                item = i;
            }
        }


        List<Integer> set = new ArrayList<>(items);
        //  List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2);
        int i = set.size();
        /*Map<Integer, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
*/

        // int result = migratoryBirds(n, ar);
        //System.out.println(result);
        System.out.println(i);
    }
}
