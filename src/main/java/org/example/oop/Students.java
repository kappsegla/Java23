package org.example.oop;

public class Students {
    public static void main(String[] args) {
        Person person = new Person("Kalle",24);
        //Person copyOfKalle = new Person(person.getName(), person.getAge());
        Person copyOfKalle = new Person(person);

        System.out.println(person.getName());
        System.out.println(copyOfKalle.getName());


        Person[] persons = {
          new Person("Anna", 32),
          new Person("Olle",17),
          new Person("Ida", 23)
        };

        for(var p: persons)
            System.out.println(p.getName());

        person.increaseAgeByOneYear();

    }
}
