package org.example.exercises.week4.vehicles;

public abstract sealed class Vehicle permits Car, Truck {
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public static void main(String[] args) {
        Vehicle vehicle= new Car("lkm123",5);
        Vehicle vehicle1= new Truck("lkm123", 5000);

        checkVehicle(vehicle);
        checkVehicle(vehicle1);
    }
    public static void checkVehicle(Vehicle vehicle){
        switch (vehicle){
            case Car car -> System.out.println("This is a car: " + car.getNumberOfSeats() + " passengers.");
            case Truck truck-> System.out.println("This is a truck: " + truck.getLoadCapacity() + " as load capacity.");
        }
    }
}

final class Car extends Vehicle{
    private final int numberOfSeats;

    public Car(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
final class Truck extends Vehicle{
    private final int loadCapacity;

    public Truck(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
