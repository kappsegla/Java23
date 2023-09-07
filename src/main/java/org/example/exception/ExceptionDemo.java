package org.example.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }

        Map<String, String> info = new HashMap<>();

        info.put("Martin", "Teacher");
        info.put("Alvin", "Teacher");
        System.out.println(info.get("Martin"));


    }
}
