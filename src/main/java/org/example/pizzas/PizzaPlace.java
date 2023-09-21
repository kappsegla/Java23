package org.example.pizzas;

public class PizzaPlace {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();

        //Add topping
        Pizza pizzaWithTopping = new AnchoviesTopping(new AnchoviesTopping(margherita));

        System.out.println(margherita.getIngredients());
        System.out.println(margherita.getPrice());

        System.out.println(pizzaWithTopping.getIngredients());
        System.out.println(pizzaWithTopping.getPrice());
    }
}
