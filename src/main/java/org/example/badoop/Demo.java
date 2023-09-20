package org.example.badoop;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Shape shape = new Square(1);
        System.out.println(shape);
        System.out.println(shape.getWidth());

        Shape shape1 = new Rectangle(10,1);
        System.out.println(shape1);
        System.out.println(shape1.getWidth());

    }
}
