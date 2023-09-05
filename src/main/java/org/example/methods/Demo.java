package org.example.methods;

public class Demo {
    public static void main(String[] args) {
        printMultiplicationTable2();
        printMultiplicationTable3();
    }

    public static void printMultiplicationTable2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
        }
    }

    public static void printMultiplicationTable3() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(3 * i);

        }
    }

}
