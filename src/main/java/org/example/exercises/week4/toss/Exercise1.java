package org.example.exercises.week4.toss;

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
