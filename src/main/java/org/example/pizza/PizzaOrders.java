package org.example.pizza;

import org.example.pizza.decorator.JalapenoDecorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrders {

    public static void main(String[] args) {
        List<Pizza> pizzaList = new ArrayList<>();

        pizzaList.add(new Margeritha());
        pizzaList.add(new Hawaii());
        pizzaList.add(new JalapenoDecorator(new Margeritha()));
        pizzaList.add(new JalapenoDecorator(new JalapenoDecorator(new Margeritha())));

        Pizza pizza;
        //What pizza do you want?
        //If choice == margeritha
        pizza = new Margeritha();
        //if choice == hawaii
        pizza = new Hawaii();

        //Do you want any extra topping?
        //if choice == jalapeno
        pizza = new JalapenoDecorator(pizza);



        pizzaList.forEach((e) -> {
            System.out.println(e.getCost());
            System.out.println(e.getDescription());
        });
    }
}
