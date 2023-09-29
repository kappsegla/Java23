package org.example.exercises.week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        
        strings.add("Hej");
        strings.add(0, "World");
        strings.addFirst("Test");
        String element = strings.get(2);
        System.out.println(element);
        strings.set(2, "Raspberry");
        element = strings.get(2);
        System.out.println("The element at index 2 has been changed to " + element);
        strings.remove(2);
        boolean empty = strings.isEmpty();
        System.out.println(empty);
        int size = strings.size();
        boolean contains = strings.contains("Raspberry");
        strings.add("West");
        strings.sort(
                Comparator
                        .comparing(s -> ((String) s).charAt(1))
                        .thenComparing(s -> ((String) s).charAt(0)));

        System.out.println(strings);

    }
}
