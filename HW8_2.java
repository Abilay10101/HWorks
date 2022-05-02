package com.example.animations;

import java.io.*;

public class HW8_2 {
    public static void main(String[] args) {

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("Exercise17_02.txt", true));
        ) {

            for (int i = 0; i < 100; i++) {
                dos.writeInt((int)(Math.random() * 10000));
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}