package org.example;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        //Print numbers 10, 20, ... 100
        for (int j = 1; j < 11; j++) {
            System.out.println(j * 10);
        }
        for (int j = 10; j <= 100; j += 10) {
            System.out.println(j);
        }

        //Print numbers 10, 9 ... 0
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }
        for (int j = 0; j < 11; j++) {
            System.out.println(10 - j);
        }

        //Print a,b,c ... z
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();
        //Print a,b,c ... z,å,ä,ö
        for (char c = 'a'; c <= 'ö'; c++) {
            System.out.print(c);
            if( c == 'z')
                c = 228;
            else if( c == 'å')
                c = 227;
            else if( c == 'ä')
                c = 245;
        }
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int k = 0;
            System.out.println("Varv: " + i);
            System.out.println("Värdet på k är: " + k++);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Woke up prematurely");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Hej");
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        int i = 0;
        while (i < 3) {
            System.out.println("Hej");
            i++;
        }

        while (true) {
            System.out.println("Skriv en siffra större än 0 för att fortsätta fler varv.");
            int value = scanner.nextInt();
            if (value <= 0)
                break;
        }
        int value = 1;
        do {
            System.out.println("Skriv en siffra större än 0 för att fortsätta fler varv.");
            value = scanner.nextInt();
        } while (value > 0);


    }
}
