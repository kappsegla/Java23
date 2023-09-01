package org.example.exercises.week1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner obj = new Scanner(System.in); //create name object
        String name = obj.nextLine(); //take string input

        String res = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Hej " + res + "!");

    }


}
