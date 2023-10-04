package org.example.functional.stream;

import org.example.oop.Students;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Johan", "Anersson", "JohanAndersson@.yahoo.com", 12, List.of(new Cource("Java", 60))));
        students.add(new Student("Jak", "Jakson", "Jakjakson@.yahoo.com", 17, List.of(new Cource("Web", 70))));
        students.add(new Student("Anders", "Anerson", "AndersAnderson@.yahoo.com", 11, List.of(new Cource("Ingen", 0))));
        students.add(new Student("Felix", "Johnson", "FelixJohnson@hotmail.com", 11, List.of(new Cource("Database", 50))));
        students.add(new Student("Tom", "Riddle", "TomRiddle@hogwarts.com", 10, List.of(new Cource("Java", 10), new Cource("Database", 20), new Cource("Javascript", 20))));
        students.add(new Student("Jonas", "Andersson", "jonasandersson@hotmail.com", 9, List.of(new Cource("Ingen", 0))));
        students.add(new Student("Pelle", "Ollesson", "Pelle@educators.glv", 6, List.of(new Cource("Java", 60), new Cource("Database", 20))));
        students.add(new Student("Adam", "Svensson", "Adam@educators.glv", 9, List.of(new Cource("Java", 60), new Cource("Web", 70))));
        students.add(new Student("Adrian", "Swamp", "Zero@FoxTrot.com", 14, List.of(new Cource("Java", -100))));

        //How many students has more than 10 credits
        System.out.println(students.stream().filter(student -> student.credits() > 10).count());

        //How many total credits for our students
        int totalCredits = students.stream()
                .mapToInt(Student::credits)
                .sum();
        System.out.println(totalCredits);



    }
}
