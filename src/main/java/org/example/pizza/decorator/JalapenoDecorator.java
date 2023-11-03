package org.example.pizza.decorator;

import org.example.pizza.Pizza;

import java.util.List;

public class JalapenoDecorator extends ToppingDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 10 + pizza.getCost();
    }

    @Override
    public List<String> getDescription() {
        var description = pizza.getDescription();
        description.add("jalapeno");
        return description;
    }
}
