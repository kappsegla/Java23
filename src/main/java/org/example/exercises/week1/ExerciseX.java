package org.example.exercises.week1;

import java.util.Arrays;

public class ExerciseX {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(numbers));

// Rad 11 är alltså första loopen: numbers[0] = numbers[9-1-0]
// Rad 12 : numbers[9-1-0] = temp;






//        int a = 10;
//        int b = 20;
//
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);
    }
}
