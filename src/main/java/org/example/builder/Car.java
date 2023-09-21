package org.example.builder;

public class Car {
    private int maxPassengers;
    private final String type;
    private final boolean hitch;
    private boolean extraLight;

    public Car(int maxPassengers, String type, boolean hitch, boolean extraLight) {
        this.maxPassengers = maxPassengers;
        this.type = type;
        this.hitch = hitch;
        this.extraLight = extraLight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getType() {
        return type;
    }

    public boolean isHitch() {
        return hitch;
    }

    public boolean isExtraLight() {
        return extraLight;
    }

    public void setExtraLight(boolean extraLight) {
        this.extraLight = extraLight;
    }

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car car = builder
                .setType("Suv")
                .setHitch(true)
                .setMaxPassengers(5)
                .createCar();
    }

}
