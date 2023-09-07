package org.example.tdd;

import java.util.Arrays;

public class Tdd {
    public static int add(String s) {
        if (s.isEmpty()) return 0;
        if( s.contains("-"))
            throw new RuntimeException();

        var numbers = s.split(",");
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
