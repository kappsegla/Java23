package org.example.oop;

public class FigureCollection {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //rectangle.width = -10;
        rectangle.setWidth(10);

        Rectangle rectangle2 = new Rectangle();
        //rectangle2.width = 20;
        rectangle2.setWidth(20);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle2.getWidth());



    }

}
