package org.example.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("Kalle", "Martin", "Bil", "Båt", "Test");

        //strings.forEach(System.out::println);

        strings.stream()
                .filter(s -> !s.startsWith("B"))
                .filter((value) -> value.endsWith("t"))
                .forEach(System.out::println);
    }
}
