package org.example.oop;

public class CarCollection {

    public static void main(String[] args) {

        //Car car1 = new Car();
        Car car1 = new Car("Tesla 3");
        //car1.setModel("Tesla 3");
        car1.setWeight(2200);
        //car1.setColor(Color.BLACK);

        System.out.println(car1.getModel());
        System.out.println(car1.getWeight());
        System.out.println(car1.getColor());
        System.out.println(car1.isStarted());


    }
}
