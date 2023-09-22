package org.example.exercises.week4.animals;

public class Cat extends Animal {
    public Cat(int size) {
        super(size, "Cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + "Cat" + '\'' +
               ", size=" + this.getSize() +
               '}';
    }


}
