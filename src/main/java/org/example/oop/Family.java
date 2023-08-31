package org.example.oop;

import java.util.ArrayList;

public class Family {

    private ArrayList<Person> members = new ArrayList<>();
    private ArrayList<Worker> workers = new ArrayList<>();

    public void run(){
        Adult adult1 =new Adult("Musse");
        Adult adult2 = new Adult("Mimmi");
        Child child = new Child("Moo");

        members.add(adult1);
        members.add(adult2);
        members.add(child);

        workers.add(adult1);
        workers.add(adult2);

        for (Person p: members ) {
            System.out.println(p.presentation());
        }

        for( Worker p : workers ) {
            System.out.println(p.work());
        }
    }

    public static void main(String[] args) {
        Family family = new Family();
        family.run();
    }
}

interface Worker {
    String work();
}

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String presentation();
}

class Adult extends Person implements Worker{

    public Adult(String name) {
        super(name);
    }

    @Override
    public String presentation() {
        return "I'm going for a car ride.";
    }

    @Override
    public String work() {
        return "Working all day.";
    }
}

class Child extends Person {

    public Child(String name) {
        super(name);
    }

    @Override
    public String presentation() {
        return "Playing with my bicycle.";
    }
}
