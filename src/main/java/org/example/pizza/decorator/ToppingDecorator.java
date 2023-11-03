package org.example.pizza.decorator;

import org.example.pizza.Pizza;

public abstract class ToppingDecorator extends Pizza {
    private final Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza  = pizza;
    }
}
