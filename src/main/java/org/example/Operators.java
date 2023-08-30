package org.example;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int tal1 = 5;
//        int divider = scanner.nextInt();
//        if( divider != 0) {
//            int tal2 = tal1 / divider;
//            System.out.println(tal2);
//        }
        float tal1 = -0.0f;
        float divider = scanner.nextFloat();
        float tal2 = tal1 / divider;
        System.out.println(tal1);
        System.out.println(tal2);





        int x = 10;
        int y;

        y = x++;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        x = 10;
        y = 0;

        //y = ++x;
        //x = x + 1;
        x += 1;
        x *= 2;  //x = x * 2;
        x %= 2;
        y = x;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
