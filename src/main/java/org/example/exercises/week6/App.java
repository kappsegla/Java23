package org.example.exercises.week6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        //salaryGreatherThan(2000000);
        //numberOfEmployees();
        //employeeWithHighestSalary();
        employeeWithLowestSalary();
    }

    private static void employeeWithLowestSalary() {
        Optional<Employee> minSalaryEmployee = employeeList.stream().min(Comparator.comparingInt(Employee::salary));
        minSalaryEmployee.stream().map(x -> x.firstName() + " " + x.lastName() + "with the minimum salary: "
                                            + x.salary()).forEach(System.out::println);

        minSalaryEmployee.ifPresent(s -> System.out.println(s.firstName() + " " + s.lastName() + " Salary: " + s.salary()));
    }

    private static void employeeWithHighestSalary() {
        System.out.println(employeeList.stream().max(Comparator.comparingInt(Employee::salary)));

        Optional<Employee> maxSalaryEmployee = employeeList.stream().max(Comparator.comparing(Employee::salary));
        if (maxSalaryEmployee.isPresent()) {
            Employee highestSalaryEmployee = maxSalaryEmployee.get();
            System.out.println("Employee with the highest salary:");
            System.out.println("Name: " + highestSalaryEmployee.firstName() + "   " + highestSalaryEmployee.lastName());
            System.out.println("Salary: " + highestSalaryEmployee.salary());
        }
    }

    private static void numberOfEmployees() {
        System.out.println("Number of employees: " + employeeList.stream().count());
    }

    private static void salaryGreatherThan(double minSalary) {
        List<Employee> highSalaryEmployees = new ArrayList<>();
        employeeList.stream()
                .filter(employees -> employees.salary() > minSalary)
                .forEach(highSalaryEmployees::add);
        System.out.println("Employees with greater salary than " + minSalary + ":");
        highSalaryEmployees.forEach(employees -> System.out.println(employees.firstName() + " " + employees.lastName()));

        //employeeList.stream().filter(x -> x.salary() > 1000000)
        //      .forEach(x -> System.out.println(x.firstName() + " " + x.lastName() + " Har över 1000000 lön"));
    }
}
