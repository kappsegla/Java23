package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Conditions {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour();

        if (hour < 9)
            System.out.println("God morgon");
        else if (hour < 12)
            System.out.println("God förmiddag");
        else if (hour < 16)
            System.out.println("God eftermiddag");
        else
            System.out.println("God kväll");

        int month = LocalDate.now().getMonth().getValue();
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> printInfoForFebruary();
            case 3, 4, 5 -> System.out.println("Spring time baby");
            case 8 -> System.out.println("August");
            default -> System.out.println("Unkown month");
        }


    }

    private static void printInfoForFebruary() {
        System.out.println("February");
        System.out.println("Cold");
    }


}
