package org.example.oop;

import java.awt.*;

public class Car {

    private String model;
    private int weight;
    private Color color;
    private boolean started;

    public Car(){
        //Constructor, default, no param constructor
        //Used for initialization of fields
        model = "";
        color = Color.BLACK;
    }

    public Car(String model){
        this();
        this.model = model;
    }


    public void setStarted(boolean started){
        this.started = started;
    }

    public boolean isStarted() {
        return started;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
