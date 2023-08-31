package org.example.objects;

public class Cylinder extends Circle {
    private float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    @Override
    public float getArea() {
        float circleArea = super.getArea();
        float circleCircumference = getCircumference();
        return 2 * circleArea + circleCircumference * height;
    }
}
