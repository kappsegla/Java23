package org.example.oop;

public class Point {

    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public double distanceTo(Point other){

        return Math.sqrt(Math.pow(other.x - this.x , 2) + Math.pow(other.y-this.y, 2));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
