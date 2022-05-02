package com.example.animations;

import java.util.*;

public class HW11_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>(); // Stores results

        System.out.println("Enter a number of integers." + "\nInput ends when the input is 0:");

        int key;
        while ((key = input.nextInt()) != 0) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            }
            else {
                int frequency = map.get(key);
                frequency++;
                map.put(key, frequency);
            }
        }


        int max = Collections.max(map.values());

        System.out.print("The most occurrences integers are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}