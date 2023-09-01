package org.example.exercises.week1;

import java.util.Arrays;

public class Exercise5{

public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Du måste ange 3 argument!. Programmet avslutas.");
            return;
        }
        int[] numbers = new int[3];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Du måste ange en siffra. Du angav något annat, så talet för detta blir 0");
                numbers[i] = 0;
            }
            if (numbers[i] < 0) {
                System.out.println("Du måste ange positiva tal. Du angav ett negativt tal, så talet för detta blir 0");
                numbers[i] = 0;
            }
        }
        
    //int max = Arrays.stream(numbers).max().getAsInt();
    int max = numbers[0];
    for (int i = 1; i < 3; i++) {
        if (numbers[i] > max)
            max = numbers[i];
    }
    System.out.println(max);
}
}
