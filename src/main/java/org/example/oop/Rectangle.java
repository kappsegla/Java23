package org.example.oop;

public class Rectangle {

    private float width;
    private float height;
    private String color;

    public void setWidth(float width) {
        if( width < 0.0)
            this.width = 0.0f;
        else
            this.width = width;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWidth() {
        return this.width;
    }
}
