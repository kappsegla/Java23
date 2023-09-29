package org.example.exercises.week5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {
        String testString = "Hej på dig sa Kalle. Hej på dig sa Ada.";
        testString = testString.replace(".", "");
        var exercise = new Exercise4();
        System.out.println( exercise.returnsUniqueWords(testString) );
    }

    public Set<String> returnsUniqueWords(String text) {
        String[] words = text.split(" ");
        Set<String> result = new HashSet<>();
        Collections.addAll(result, words);
        return result;
    }
}
