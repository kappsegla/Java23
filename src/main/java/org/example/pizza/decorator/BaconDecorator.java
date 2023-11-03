package org.example.pizza.decorator;

import org.example.pizza.Pizza;

public class BaconDecorator extends ToppingDecorator{

    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 15 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", 🥓";
    }
}
