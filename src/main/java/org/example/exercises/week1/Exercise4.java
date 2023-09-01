package org.example.exercises.week1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a day of the week:");
        
        String day = scanner.next();
        day = day.toLowerCase();

        day = switch (day) {
            case "Mon", "mon", "Monday", "monday" -> "1";
            case "Tue", "tue", "Tuesday", "tuesday" -> "2";
            case "Wed", "wed", "Wednesday", "wednesday" -> "3";
            case "Thu", "thu", "Thursday", "thursday"  -> "4";
            case "Fri", "fri", "Friday", "friday" -> "5";
            case "Sat", "sat", "Saturday", "saturday" -> "6";
            case "Sun", "sun", "Sunday", "sunday" -> "7";
            default -> "0";
        };
        System.out.println(day);
    }

}
