package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    int number;

    public static void main(String[] args) {
        float tal = 16777216.0f;
        tal = tal + 2;
        System.out.println(tal);

        int variable = 10;
        Integer i = Integer.valueOf(10);
        int x = 011;

        String text = "This is some text";
        var number = 100;

        for (int j = 0; j < 10; j++) {

        }

        int k = 0;
        while(k < 10) {


            k++;
        }

        do {
            
        }while(k < 10);

        int exempel = (int) 1.2;
        System.out.println(exempel);
        double exampel2 = 16777217;

        long a = Long.MAX_VALUE;
        float b = a;
        System.out.println(a);
        System.out.println(b);


        System.out.println("Hello There!");
        int state = 1;
        if (state < 0 && afterLunch()) {

        }
        int balls = 2;
        String message = "" + balls;// + (balls > 1 ? " balls": " ball");
        System.out.println(message);
        String message2 = String.valueOf(balls);
        System.out.println(message2);
        String message3 = Integer.toString(balls);
        System.out.println(message3);

        switch (balls) {
            case 1 -> System.out.println("One ball");
            case 2 -> System.out.println("Two balls");
            default -> System.out.println("Too many balls");
        }

        Scanner scanner = new Scanner(System.in);

        String text2 = scanner.nextLine();

        if( text2.equals("Hej") ){
            System.out.println("Det var sant");
        }

    }

    public static boolean afterLunch() {
        return LocalDateTime.now().getHour() >= 12;
    }

}
