package com.example.animations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HW10_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 5000000; i++ ){
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i =0; i< arrayList.size(); i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arraylist is " + (end-start) + " ms.");

        start = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext())
            iterator.next();
        end = System.currentTimeMillis();
        System.out.println("Time taken for linkedlist is " + (end-start) + " ms.");

    }
}