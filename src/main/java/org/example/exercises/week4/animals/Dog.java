package org.example.exercises.week4.animals;

public class Dog extends Animal {
    public Dog(int size) {
        super(size, "Dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + "Dog" + '\'' +
               ", size=" + this.getSize() +
               '}';
    }

}
