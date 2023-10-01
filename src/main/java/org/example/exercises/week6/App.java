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


//        List all distinct project in non-ascending order.
//        Print full name of any employee whose firstName starts with ‘A’.
//        List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
//        Sort employees based on firstName, for same firstName sort by salary.
//        Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
//        Print list of all employee with min salary.
//        Count of total laptops assigned to the employees.
//        Count of all projects with Robert Downey Jr as PM.
//        List of all projects with Robert Downey Jr as PM.
//        List of all people working with Robert Downey Jr.
//        Create a map based on this data, they key should be the year of joining, and value should be list of all the employees who joined the particular year. (Hint : Collectors.toMap)
//        Create a map based on this data, the key should be year of joining and value should be the count of people joined in that particular year. (Hint : Collectors.groupingBy())
    }
}
