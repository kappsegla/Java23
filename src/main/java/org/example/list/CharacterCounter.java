package org.example.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> charCounter = new HashMap<>();
        char c;
        do {
            c = scanner.nextLine().charAt(0);

//            if (charCounter.containsKey(c)) {
//                var currentValue = charCounter.get(c);
//                currentValue++;
//                charCounter.put(c, currentValue);
//            } else
//                charCounter.put(c, 1);

            //charCounter.computeIfPresent(c, (k, v) -> v + 1);
            //charCounter.putIfAbsent(c, 1);

            charCounter.merge(c, 1, (k, v) -> v + 1);

        } while (c != '0');

        //Print result
        charCounter.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
