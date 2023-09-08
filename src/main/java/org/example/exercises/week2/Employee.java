package org.example.exercises.week2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private int salary;
    private final LocalDate dateWhenHired;

    public Employee(String name, int salary, LocalDate dateWhenHiredHired){
        this.name = name;
        this.salary = salary;
        this.dateWhenHired = dateWhenHiredHired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateWhenHired() {
        return dateWhenHired;
    }
    public Period employmentTime(LocalDate dateToCompareWith){
        return Period.between(dateToCompareWith, dateWhenHired);
    }
    public Period employmentTime(String dateToCompareWith){
        return employmentTime(LocalDate.parse(dateToCompareWith));
    }
    public Period employmentTime(){
       return employmentTime(LocalDate.now());
    }

    public static void main(String[] args) {
        Employee number1 = new Employee("Kalle",24000, LocalDate.of(2022,1,1));
        System.out.println(number1.employmentTime());
        System.out.println(number1.employmentTime(LocalDate.of(2023,9,8)));
        System.out.println(number1.employmentTime("2023-09-08"));
    }
}
