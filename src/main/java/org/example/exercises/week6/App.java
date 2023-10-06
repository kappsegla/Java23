package org.example.exercises.week6;

import java.util.ArrayList;
import java.util.List;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // TODO: try implementing more queries against the List<Employee>
        salaryGreatherThan(2000000);

        //employeeList.stream().filter(x -> x.salary() > 1000000)
        //      .forEach(x -> System.out.println(x.firstName() + " " + x.lastName() + " Har över 1000000 lön"));


    }

    private static void salaryGreatherThan(double minSalary) {
        List<Employee> highSalaryEmployees = new ArrayList<>();
        employeeList.stream()
                .filter(employees -> employees.salary() > minSalary)
                .forEach(highSalaryEmployees::add);
        System.out.println("Employees with greater salary than " + minSalary + ":");
        highSalaryEmployees.forEach(employees -> System.out.println(employees.firstName() + " " + employees.lastName()));
    }
}
