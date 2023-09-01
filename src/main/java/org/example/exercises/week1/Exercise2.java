package org.example.exercises.week1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in två tal så skall jag returnera medelvärde!");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        double mean = (double) (numberOne + numberTwo ) / 2;
        //double mean = (num1 + num2) / 2.0;
        System.out.println("Ditt medelvärde är: " + mean);
        
    }
}
