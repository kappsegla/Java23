package org.example.pizza.decorator;

import org.example.pizza.Pizza;

import java.util.List;

public class BaconDecorator extends ToppingDecorator {

    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 15 + pizza.getCost();
    }

    @Override
    public List<String> getDescription() {
        var description = pizza.getDescription();
        description.add("🥓");
        return description;
    }
}
