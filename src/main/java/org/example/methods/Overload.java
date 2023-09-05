package org.example.methods;

public class Overload {
    public static void main(String[] args) {
        display(10);
    }

    public static void display(int value){
        System.out.println("This method takes an argument of type int");
    }
    public static void display(int value, int value2){
        System.out.println("This method takes two arguments of type int");
    }
    public static void display(String value) {
        System.out.println("This method takes an argument of type String");
    }

    public static void display() {
        System.out.println("This is the default value");
    }

}
