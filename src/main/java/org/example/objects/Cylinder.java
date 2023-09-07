package org.example.objects;

import java.util.Objects;

public class Cylinder extends Circle {
    private float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public float getArea() {
        float circleArea = super.getArea();
        float circleCircumference = getCircumference();
        return 2 * circleArea + circleCircumference * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
               "radius=" + radius +
               ","+
               "height=" + height +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Float.compare(height, cylinder.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
