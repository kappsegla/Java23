package org.example.exercises.week4.animals;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Zoo implements Iterable<Animal> {
    private Animal[] animals = new Animal[10];

    void add(Animal a) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = a;
                return;
            }
        }
    }

    Animal get(int index) {
        return animals[index];
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Cat(1));
        zoo.add(new Dog(2));
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
    }

    @Override
    public Iterator<Animal> iterator() {
        return new ZooIterator();
    }

    class ZooIterator implements Iterator<Animal> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return animals[index] != null;
        }

        @Override
        public Animal next() {
            if (animals[index] == null)
                throw new NoSuchElementException();
            return animals[index++];
        }
    }
}
