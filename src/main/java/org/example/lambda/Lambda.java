package org.example.lambda;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        Present present = new Present() {
            @Override
            public void display() {
                System.out.println("Hello from anonymous class");
                System.out.println(getClass().getName());
            }
        };
        present.display();

        Present present2 = () -> System.out.println("Hello from another implementation");
        present2.display();


        Function<Integer, String> lambdaImpl = (s) -> getString(s);


        if(true) {
            extracted();
        }
    }

    private static void extracted() {
        System.out.println();
        System.out.println();
    }

    private static String getString(Integer s) {
        if (s.intValue() > 0) return s.toString();
        else return "";
    }
}
