package org.example.exercises.week1;

import java.util.Scanner;

public class    Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv två tal så jag ger dig summa");
        int tal1 = scanner.nextInt();
        int tal2 = scanner.nextInt();
        int summa;
        if (tal1 < 0) tal1 = tal1 * (-1);
        if (tal2 < 0) tal2 = -tal2;
        //tal1 = Math.abs(tal1);
        if (tal1 == tal2)
            summa = tal2 * 4;
        else
            summa = tal1 + tal2;
        System.out.println("Här kommer summa: " + summa);
    }
}
