package org.example.exercises.week4.animals;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animal implements Comparable<Animal>{
    private int size;
    private final String name;

    public Animal(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String toString() {
        return "Animal{" +
               "size=" + size +
               ", name='" + name + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal o) {
        return this.size - o.size;
    }

    public static void main(String[] args) {
        Animal cat = new Cat(1);
        Animal dog = new Dog(1);
        System.out.println(cat.equals(dog));

        Animal[] animals = {new Cat(10),new Cat(2), new Dog(2),new Dog(1)};
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
    }
}

class Cat extends Animal {
    public Cat(int size) {
        super(size,"Cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + "Cat" + '\'' +
               ", size=" + this.getSize() +
               '}';
    }



}

class Dog extends Animal {
    public Dog(int size) {
        super(size,"Dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + "Dog" + '\'' +
               ", size=" + this.getSize() +
               '}';
    }

}
