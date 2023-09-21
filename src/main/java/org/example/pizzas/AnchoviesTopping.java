package org.example.pizzas;

public class AnchoviesTopping extends Topping{
    public AnchoviesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return 20 + pizza.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + ",Anchovies";
    }
}
