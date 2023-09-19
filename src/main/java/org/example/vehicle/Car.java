package org.example.vehicle;

public final class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getServiceIntervallInKm() {
        return 20000;
    }
}
