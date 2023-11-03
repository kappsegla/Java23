package org.example.pizza.decorator;

import org.example.pizza.Pizza;

public class JalapenoDecorator extends ToppingDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 10 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", jalapeno";
    }
}
