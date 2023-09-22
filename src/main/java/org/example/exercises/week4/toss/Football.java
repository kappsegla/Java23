package org.example.exercises.week4.toss;

public class Football extends Ball {
    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void bounce() {
        System.out.println("Football bounces");
    }

    @Override
    public void toss() {
        System.out.println("Tossed a Football!");
    }
}
