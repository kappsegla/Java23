package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Utils.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (var number : array ) {
            System.out.print(number + ", ");
        }
        
        Arrays.stream(array).mapToObj(number -> number + ", ").forEach(System.out::print);

        String name = "";
        if(name.isEmpty())
            System.out.println("No name");

        int[] ints = {1,2,3,4,5};

        String[] strings = new String[2];


    }

    public static boolean afterLunch() {
        return LocalDateTime.now().getHour() >= 12;
    }
}
