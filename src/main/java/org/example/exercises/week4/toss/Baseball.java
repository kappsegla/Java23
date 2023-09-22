package org.example.exercises.week4.toss;

public class Baseball extends Ball {
    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("I am flying...");
    }

    @Override
    public void bounce() {
        System.out.println("Ouch!!");
    }
}
