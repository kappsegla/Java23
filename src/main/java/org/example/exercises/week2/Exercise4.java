package org.example.exercises.week2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }

    public float readFloat(){
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }

    public double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }


    public static void main(String[] args) {
        Locale swedishLocale = new Locale("sv", "SE");
        Locale.setDefault(swedishLocale);
        Exercise4 exercise4 = new Exercise4();

        System.out.println("Int: " + exercise4.readInt());
        System.out.println("String: " + exercise4.readString());

    }
}
