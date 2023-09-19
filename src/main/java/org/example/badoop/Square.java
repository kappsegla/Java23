package org.example.badoop;

import java.util.Objects;

//Square is not a subtype to Rectangle!!!
public class Square implements Shape{

    private int size;
    public Square(int size){
        this.size = size;
    }

    @Override
    public int getWidth() {
        return size;
    }

    @Override
    public int getHeight() {
        return size;
    }

    public void setWidth(int width) {
        size = width;
    }

    public void setHeight(int height) {
        size = height;
    }

    @Override
    public String toString() {
        return "Square{" +
               "size=" + size +
               '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return size == square.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
