package org.example.exercises.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        //Example query
        employeeList.stream()
                .skip(5)
                .forEach(System.out::println);

        // TODO: try implementing more queries against the List<Employee>






    }
}
