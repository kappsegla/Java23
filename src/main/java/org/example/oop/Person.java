package org.example.oop;

public class Person {
    private final String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }


    //No setName method. Name can only be set when creating a new Person
    //Name field is immutable in Person objects.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseAgeByOneYear(){
        this.age++;
    }
}
