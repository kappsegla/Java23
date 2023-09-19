package org.example;

public class RecordDemo {
    public static void main(String[] args) {
        Drink drink = new Drink("Red Bull",46000);
        System.out.println(drink.energy());
        System.out.println(drink);
    }
}
