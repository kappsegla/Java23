package org.example.exercises.week1;

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 3, 4};
        int count = 0;
        for (int i = 0; i < array.length - 2; i += 2) {
            if (array[i] == array[i + 2] || array[i] == array[i + 3]
                || array[i + 1] == array[i + 2] || array[i + 1] == array[i + 3]) {
                count++;
            }

//            Set<Integer> set = new HashSet<>(List.of(Arrays.copyOfRange(array, i, i + 4)));
//            if (set.size() != 4)
//                count++;
        }

        if (count == array.length / 2 - 1) {
            System.out.println("Everywhere");
        } else if (count > 0) {
            System.out.println("Somewhere");
        } else
            System.out.println("Nowhere");


    }
}
