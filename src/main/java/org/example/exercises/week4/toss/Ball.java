package org.example.exercises.week4.toss;

public abstract class Ball implements Tossable {
    private final String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public abstract void bounce();

}
