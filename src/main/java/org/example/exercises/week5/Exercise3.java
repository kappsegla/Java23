package org.example.exercises.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> listArray = new ArrayList<>();
        listArray.add("1");
        listArray.add("2");
        listArray.add("3");
        listArray.add("4");
        listArray.add("5");
        System.out.println(listArray);
        List<String> reversedList = new ArrayList<>(listArray.reversed());
        System.out.println(reversedList);

    }
    public List<String> returnsReversed(List<String> listOfString) {
        List<String> result = new ArrayList<>();
        for (String element : listOfString) {
            result.add(0, element);
        }
        return result;
    }

    public static List<String> reverse(List<String> list){
        List<String> newReversedList = new ArrayList<>(list);
        Collections.reverse(newReversedList);
        return newReversedList;
    }

}
