package org.example;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Scanner;


public class App {

    /**
     * This is main method for our program
     * @param args This parameter takes some information
     * @throws UnsupportedEncodingException Will be thrown when using an unsupported encoding
     */
    public static void main(String[] args) throws IOException {

        //char ch = 65;
        char ch = 'A';
        char ch2 = 'Ƨ';

        System.out.println(ch2);

        String text = "Hej\" 😎😎😎😎";

        System.out.println(text);
        String multiline = """
                Det här är
                flera rader med citat i "
                text.
                 """;
//          PrintStream out = new PrintStream(System.out, true, StandardCharsets.ISO_8859_1);
//          out.println(multiline);

        int a = 5;
        int b;

        //Läs in ett tal från tangenbordet till variabeln b
        Scanner scanner = new Scanner(System.in);
        //b = scanner.nextInt();

        //int c = a + b;

        //System.out.println(c);


        long l = Long.MAX_VALUE;
        double d = l;
        System.out.println(d);

        float f = 0.234f;
        System.out.println(f);

        //f = (int)(f * 100 + 0.5f) / 100.0f;
        f = Math.round(f * 100) / 100.0f;

        System.out.println(f);


        //variables();
    }

    public static void variables() {
        int age = 20;
        age = 30;
        System.out.println(age);
        int dayOfWeek;
        dayOfWeek = 2;
        System.out.println(dayOfWeek);

        boolean dayTime = true;
        System.out.println(dayTime);

        double milkPrice = 15.95;
        float breadPrice = 20.50f;
        double minimumPrice = .50;
        float overflow = 10.12345678834343434f;
        System.out.printf("%.10f\n", overflow);

        int hugeNumber = Integer.MAX_VALUE;

        float maxfloat = hugeNumber;

        System.out.println(hugeNumber);
        System.out.println();
        System.out.println(maxfloat);

        float withGap = 16777216.0f;
        System.out.println(withGap + 4);

        BigDecimal price = new BigDecimal("16777217.123456789");
        System.out.println(price);


        double random = Math.random();
        byte wrap = 127;
        System.out.println(wrap);
        wrap = (byte) (wrap + 1);
        System.out.println(wrap);
        System.out.println(Integer.toHexString(wrap));

        int hex = 0xffffff80;
        int bin = 0b0000101;
    }
}
