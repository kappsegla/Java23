package org.example.tuple;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        return List.of();
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

    public Optional<Car> getCarByType(String type) {
        if (type.equals("SUV"))
            return Optional.of(new Car("SUV"));
        else
            return Optional.empty();
    }


    public static void main(String[] args) {
        var pair = new TupleDemo().test6();
        System.out.println(pair);

        var car = new TupleDemo().getCarByType("SUV");
        car.ifPresent(System.out::println);
        car.ifPresentOrElse(System.out::println, ()-> System.out.println("No car"));
    }

    public record Car(String type) {
    }
}
