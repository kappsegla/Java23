package org.example.lambda;

public class PresentToConsole implements Present {
    @Override
    public void display() {
        System.out.println("This is a message to the console");
    }
}
