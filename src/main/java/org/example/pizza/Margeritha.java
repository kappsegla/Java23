package org.example.pizza;

public class Margeritha extends Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Ost, tomatsås, oregano";
    }
}
