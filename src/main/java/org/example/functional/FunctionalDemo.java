package org.example.functional;

import java.util.function.Function;

public class FunctionalDemo {

    public static void main(String[] args) {

        final String[] replaceWith = {"X"};

        java.util.function.Function<String, String> function = (s) -> s.replace("T", replaceWith[0]);

        replaceWith[0] = "Q";

        higherOrderFunction(function);
        //System.out.println(function.apply("Test"));

    }

    public static void higherOrderFunction(Function<String, String> functionAsParameter) {
        System.out.println(functionAsParameter.apply("Test"));
    }


}
