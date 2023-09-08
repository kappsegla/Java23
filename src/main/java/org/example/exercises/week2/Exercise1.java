package org.example.exercises.week2;

import java.util.Scanner;

public class Exercise1 {
    Scanner scanner = new Scanner(System.in);


    public static int smallestNumberOfThree(int a, int b, int c){
        if(a<b && a<c){
            return a;
        } else if (b<a && b<c) {
            return b;
        } else return c;
    }

    public static int smallestValue(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
    
    public static double smallestValue(double tal1,double tal2,double tal3){
        double[] tal= {tal1,tal2,tal3};
        double minstal=tal[0];
        for (int i = 0; i < 3; i++) {
            if (tal[i]<minstal)
                minstal=tal[i];
        }
        return minstal;
    }
    public static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber ) {
        if(firstNumber < secondNumber && firstNumber < thirdNumber){
            return firstNumber;
        }
        if(secondNumber < firstNumber && secondNumber <thirdNumber){
            return secondNumber;
        }
        return thirdNumber;
    }
    public static int minValue(Scanner scanner) {

        int minstaTal = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ange ett heltal: ");
            int inmatatTal = scanner.nextInt();

            if (inmatatTal < minstaTal) {
                minstaTal = inmatatTal;
            }
        }
        return minstaTal;
    }
    public static int findLowestValue(int tal1, int tal2, int tal3){
        int lowestValue = tal1;
        if(tal2 < lowestValue) {
            lowestValue = tal2;
        }
        if(tal3 < lowestValue){
            lowestValue = tal3;
        }
        return lowestValue;
    }
    public static int getMin(int[] numbers, int numbersLength) {
        if (numbersLength == 1)
            return numbers[0];
        return Math.min(numbers[numbersLength - 1], getMin(numbers, numbersLength - 1));
    }

}
