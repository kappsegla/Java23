package org.example.pizza.decorator;

import org.example.pizza.Pizza;

import java.util.List;

public class RemoveTopping extends ToppingDecorator {
    private int price;
    private String name;

    public RemoveTopping(int price, String name, Pizza pizza) {
        super(pizza);
        this.price = price;
        this.name = name;
    }

    @Override
    public int getCost() {
        return pizza.getCost() - price;
    }

    @Override
    public List<String> getDescription() {
        var description = pizza.getDescription();
        description.remove(name);
        return description;
    }

}
