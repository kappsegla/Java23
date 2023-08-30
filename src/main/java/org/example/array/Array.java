package org.example.array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] myArray;

        myArray = new int[10];

        myArray[0] = 1;
        myArray[1] = 2;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int j : myArray) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(myArray));
    }
}
