package com.example.animations;

import java.util.PriorityQueue;

public class HW10 {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("B");
        queue.add("C");
        queue.add("A");
        queue.add("E");
        queue.add("D");
        queue.add("Z");

        while(!queue.isEmpty()){
            System.out.println(queue.poll() + " ");
        }
    }
}