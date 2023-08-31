package org.example.objects;

public class Objects {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0f);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(1.0f, 1.0f);
        System.out.println(cylinder.getArea());

        Circle circle1 = new Cylinder(1.0f,1.0f);
        System.out.println(circle1.getArea());

        Circle[] circles = new Circle[3];
        circles[0] = circle;
        circles[1] = cylinder;
        circles[2] = circle1;

        Object anything = cylinder;
        System.out.println(((Cylinder) anything).getArea());


    }
}
