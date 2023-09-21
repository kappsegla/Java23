package org.example.pizzas;

public class ChampignonsTopping extends Topping{

    public ChampignonsTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return 10 + pizza.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + ",Champignons";
    }
}
