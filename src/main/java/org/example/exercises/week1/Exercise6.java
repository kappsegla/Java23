package org.example.exercises.week1;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int[] slumptal = new int[10];
        int[] slumpReversed = new int[10];
        Random random = new Random();
        for (int i = 0; i < slumptal.length; i++) {
            int a = random.nextInt();
            slumptal[i] = a;   
        }
        for (int i = 0; i < slumpReversed.length; i++) {
            slumpReversed[i]=slumptal[9-i];
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(slumptal[j] + ", ");
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print(slumpReversed[j] + ", ");
        }

        long summan = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                summan = slumpReversed[i] + summan;
            }
        }
        System.out.println("\n" + "Summan av slumptal: " + summan);


    }
}
