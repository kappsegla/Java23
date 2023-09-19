package org.example.vehicle;

public final class Truck extends Vehicle {
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getServiceIntervallInKm() {
        return 50000;
    }
}
