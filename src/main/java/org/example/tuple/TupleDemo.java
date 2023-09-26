package org.example.tuple;

import java.util.List;
import java.util.Objects;

public class TupleDemo {

    public int test() {
        return 0;
    }

    public int[] test2() {
        return new int[]{1, 2, 3};
    }

    public String test3() {
        return "Hello";
    }

    public List<String> test4() {
        return List.of("Hej", "Hello");
    }

    public Pair<String, String> test5() {
        return Pair.of("Hej", "Hallå");
    }

    public Pair<Integer, Integer> test6() {
        return Pair.of(Integer.valueOf(10), Integer.valueOf(20));
    }

    public Pair<String, Double> test7() {
        return Pair.of("Hej", 0.1);
    }


    public static void main(String[] args) {
        var pair = new TupleDemo().test6();
        System.out.println(pair);


    }

}
