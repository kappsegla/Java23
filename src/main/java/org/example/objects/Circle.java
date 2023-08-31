package org.example.objects;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea(){
        return (float) (radius * radius * Math.PI);
    }

    public float getCircumference(){
        return (float)(2 * radius * Math.PI);
    }

}
