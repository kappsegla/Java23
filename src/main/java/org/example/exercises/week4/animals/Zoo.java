package org.example.exercises.week4.animals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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
//        List<String> strings = new ArrayList<>();
//        strings.add("A");
//        strings.add("B");
//        strings.add("C");
//        strings.forEach( (s) -> System.out.println(s));
        Zoo zoo = new Zoo();
        zoo.add(new Cat(1));
        zoo.add(new Dog(2));
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
        zoo.forEach((animal) -> System.out.println(animal));
        zoo.forEach(System.out::println);
    }

    @Override
    public void forEach(Consumer<? super Animal> action) {
        for (Animal a : animals) {
            if (a != null)
                action.accept(a);
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
