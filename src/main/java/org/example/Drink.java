package org.example;

import org.example.vehicle.Maintainable;

import java.util.Objects;

//Immutable class
//final class, no inheritance
//Can't use extends on record
//Can implement interfaces
public record Drink(String name, int energy) {}

record DrinkWithSize(String name, int energy, int size){}
