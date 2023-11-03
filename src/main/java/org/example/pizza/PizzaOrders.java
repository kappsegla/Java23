package org.example.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrders {

    public static void main(String[] args)
    {
        List<Pizza> pizzaList = new ArrayList<>();

        pizzaList.add(new Margeritha());
        pizzaList.add(new Hawaii());
        pizzaList.add(new Margeritha());

        pizzaList.forEach((e)->{
            System.out.println(e.getCost());
            System.out.println(e.getDescription());});
    }
}
