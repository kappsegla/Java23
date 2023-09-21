package org.example.builder;

public class CarBuilder {
    private int maxPassengers;
    private String type;
    private boolean hitch = false;
    private boolean extraLight = false;

    public CarBuilder setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        return this;
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CarBuilder setHitch(boolean hitch) {
        this.hitch = hitch;
        return this;
    }

    public CarBuilder setExtraLight(boolean extraLight) {
        this.extraLight = extraLight;
        return this;
    }

    public Car createCar() {
        return new Car(maxPassengers, type, hitch, extraLight);
    }
}
