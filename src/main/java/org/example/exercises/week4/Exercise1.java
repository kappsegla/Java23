package org.example.exercises.week4;

import java.io.Serializable;

public class Exercise1 {

    public static void main(String[] args) {
        Tossable tossable1 = new Rock();
        tossable1.toss();
        Ball ball1 = new Baseball("Rawlings");
        Ball ball2 = new Football("Adidas");
        System.out.println(ball1.getBrandName());
        ball1.bounce();
        ball1.toss();

        System.out.println(ball2.getBrandName());
        ball2.bounce();
        ball2.toss();
    }

}

interface Tossable {
    void toss();
}

abstract class Ball implements Tossable {
    private final String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public abstract void bounce();

}

class Rock implements Tossable {
    @Override
    public void toss() {
        System.out.println("A rock skips on the water surface");
    }
}

class Baseball extends Ball {
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

class Football extends Ball {
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
