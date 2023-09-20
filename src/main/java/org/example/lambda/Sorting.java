package org.example.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

    public static void main(String[] args) {
        Integer[] ints = {4, 2, 3, 1};

        //Arrays.sort(ints);
        //Arrays.sort(ints, (a, b) -> a - b);
        //Arrays.sort(ints, Sorting::compareInt);
        //Arrays.sort(ints, Sorting.compareInt());
        Arrays.sort(ints, Comparator.reverseOrder());
        System.out.println(Arrays.toString(ints));

        String[] strings = {"k", "a", "abc", "ha"};

        Arrays.sort(strings, Comparator.reverseOrder());
        System.out.println(Arrays.toString(strings));

        Tuple[] tuples = {new Tuple(2, "b"), new Tuple(1, "c"), new Tuple(3, "a"), new Tuple(2, "a")};

        Arrays.sort(tuples, (a, b) -> a.value() - b.value());
        Arrays.sort(tuples, Comparator.comparingInt(Tuple::value));
        System.out.println(Arrays.toString(tuples));
        Arrays.sort(tuples, Comparator.comparingInt(Tuple::value).reversed());
        System.out.println(Arrays.toString(tuples));

        Arrays.sort(tuples, (a, b) -> a.text().compareTo(b.text()));
        System.out.println(Arrays.toString(tuples));

        Arrays.sort(tuples, Comparator.comparing(Tuple::text).thenComparingInt(Tuple::value));
        System.out.println(Arrays.toString(tuples));
    }

    public static int compareInt(Integer a, Integer b) {
        return a - b;
    }

    public static Comparator<Integer> compareInt() {
        return (o1, o2) -> o1 - o2;
    }
}

record Tuple(int value, String text) {
}
