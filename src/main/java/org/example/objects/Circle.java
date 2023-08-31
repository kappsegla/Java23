package org.example.objects;

import java.util.Objects;

public class Circle {
    protected float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea(){
        return (float) (radius * radius * Math.PI);
    }

    public float getCircumference(){
        return (float)(2 * radius * Math.PI);
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
               "radius=" + radius +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
