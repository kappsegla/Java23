package org.example.methods;

public class Demo {
    public static void main(String[] args) {
        printMultiplicationTable2();
        printMultiplicationTable3();
        printMultiplicationTable(2);
        printMultiplicationTable(4);

        int value = 5;
        printMultiplicationTable(value);

        printPartOfMultiplicationTable(3,5);
        printWithTwoDecimals(0.12345f);
        printWithTwoDecimals(10);

    }

    public static void printWithTwoDecimals(float value){
        System.out.printf("%.2f\n", value);
    }

    public static void printMultiplicationTable(int tableNr){
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNr * i);
        }
    }

    public static void printPartOfMultiplicationTable(int tableNr, int steps){
        for (int i = 1; i <= steps; i++) {
            System.out.println(tableNr * i);
        }
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
