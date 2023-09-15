package org.example.exercises.week3;

public class Vehicle {
    public void drive(){

    }



    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        Vehicle vehicle = new Car();
        vehicle.drive();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.drive();

    }
}
