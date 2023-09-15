package org.example.exercises.week3;

public class Exercise1 {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 8, 10};
        //array skapat med ett antal fasta värden

        try {
            checkEvenNumbers(numbers);
            System.out.println("Alla tal är jämna.");
        }
        catch (RuntimeException e) {
            System.out.println("Det finns udda tal i din array.");

        }
    }
    public static void checkEvenNumbers(int[] numbers) {
        for (int num : numbers){
            if (num % 2 !=0) {
                throw new RuntimeException();
            }
        }
    }

}
