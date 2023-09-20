package org.example.lambda;

public class Calculate {

    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator substraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        printCalculation(10, 5, addition);
        printCalculation(10, 5, (a, b) -> a / b);
    }

    public static void printCalculation(int num1, int num2, Calculator calculator) {
        System.out.println(calculator.calculate(num1, num2));
    }


}
