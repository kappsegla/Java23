package org.example.pizzas;

public class Margherita implements Pizza{
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "Cheese,Tomato Sauce";
    }
}
