package org.example.exercises.week6;

import java.util.*;
import java.util.function.Function;
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
        //employeeWithLowestSalary();
        //employeesWorkingOnMoreThanOneProject();
        //findAllProjectNames();
        //groupByProjectCount();
        //allSalariesGreaterThan(1000000);
        //checkForSalaryLessThan();
        //totalSalaries();
        //printEmployeesSortedBySalaryAscendingOrder();
        //projectNames();
        //limitAndSkip();
        //minMaxWithTeeing();
        //employeesByProject();
        //totalSalaryForEachProject();
        //highestSalaryForEachProject();
        groupProjectsUnderTeams();
    }

    private static void groupProjectsUnderTeams() {
        employeeList.stream()
                .map(Employee::projects)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Project::team, Collectors.mapping(Project::name, Collectors.toSet())))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }

    private static void highestSalaryForEachProject() {
        var map = employeeList.stream()
                .flatMap(employeeToEmployeeAndProjectName())
                .collect(Collectors.groupingBy(EmployeeAndProjectName::projectName,
                        Collectors.maxBy(Comparator.comparingInt(n -> n.employee().salary()))));
        map.entrySet().forEach(System.out::println);
    }

    private static void totalSalaryForEachProject() {
        var map = employeeList.stream()
                .flatMap(employeeToEmployeeAndProjectName())
                .collect(Collectors.groupingBy(EmployeeAndProjectName::projectName, Collectors.summingInt(n -> n.employee.salary())));
        map.entrySet().forEach(System.out::println);
    }

    private static void employeesByProject() {
        var map = employeeList.stream()
                .flatMap(employeeToEmployeeAndProjectName())
                .collect(Collectors.groupingBy(EmployeeAndProjectName::projectName));
        map.entrySet().forEach(System.out::println);
    }

    private static Function<Employee, Stream<? extends EmployeeAndProjectName>> employeeToEmployeeAndProjectName() {
        return employee -> employee.projects().stream().map(project -> new EmployeeAndProjectName(employee, project.name()));
    }

    record EmployeeAndProjectName(Employee employee, String projectName) {
    }

    private static void minMaxWithTeeing() {
        employeeList.stream().collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Employee::salary)),
                        Collectors.minBy(Comparator.comparing(Employee::salary)),
                        List::of))
                .forEach(System.out::println);
    }

    private static void limitAndSkip() {
        List<Employee> limitEmploy = employeeList.stream().limit(5).toList();
        limitEmploy.forEach(System.out::println);

        List<Employee> fiveEmploy = employeeList.stream().skip(5).toList();
        fiveEmploy.forEach(System.out::println);
    }

    private static void projectNames() {
        var projectsList = employeeList.stream()
                .filter(Objects::nonNull)
                .flatMap(x -> x.projects().stream())
                .map(Project::name)
                .distinct()
                .toList();

        projectsList.forEach(System.out::println);
    }

    private static void printEmployeesSortedBySalaryAscendingOrder() {
        List<Employee> sortedEmploy = employeeList.stream()
                .sorted(Comparator.comparing(Employee::salary)).toList();
        sortedEmploy.stream().map(x -> x.firstName() + " " + x.lastName() + " with " + x.salary() + " kr").forEach(System.out::println);
    }

    private static void totalSalaries() {
        System.out.println("Total salary of all employees: "
                           + employeeList.stream()
                                   .mapToDouble(Employee::salary)
                                   .sum());
    }

    private static void checkForSalaryLessThan() {
        System.out.println(employeeList.stream().anyMatch(x -> x.salary() < 1_000_000));
    }

    private static void allSalariesGreaterThan(int salary) {
        System.out.println(employeeList.stream().allMatch(x -> x.salary() > salary));
    }

    private static void groupByProjectCount() {
        Map<Integer, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy((n) -> n.projects().size()));
        map.forEach((key, employees) -> System.out.println(key + " : " + employees.stream().map(Employee::firstName).toList()));
    }

    private static void findAllProjectNames() {
        List<String> allProjectNames = employeeList.stream()
                .flatMap(employees -> employees.projects().stream())
                .map(Project::name)
                .distinct()
                .toList();
        System.out.println("Names of all projects: ");
        allProjectNames.forEach(System.out::println);

        employeeList.stream()
                .flatMap((e) -> e.projects().stream())
                .map((Project::name))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Set<String> projectsName = employeeList.stream().flatMap(x -> x.projects().stream())
                .map(x -> "* " + x.name() + " *\t").collect(Collectors.toSet());
        System.out.println(projectsName);
    }

    private static void employeesWorkingOnMoreThanOneProject() {
        var moreThanTwoProject = employeeList.stream()
                .filter(x -> x.projects().size() > 1)
                .map(x -> x.lastName() + " " + x.firstName() + "who with " + x.projects().size() + " projects")
                .collect(Collectors.toList());
        moreThanTwoProject.forEach(System.out::println);
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
