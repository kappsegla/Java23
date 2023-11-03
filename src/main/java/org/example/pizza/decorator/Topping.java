package org.example.pizza.decorator;

import org.example.pizza.Pizza;

public class Topping extends ToppingDecorator{
    private int price;
    private String name;

    public Topping(int price, String name, Pizza pizza) {
        super(pizza);
        this.price = price;
        this.name = name;
    }

    @Override
    public int getCost() {
        return price + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", " + name;
    }
}
