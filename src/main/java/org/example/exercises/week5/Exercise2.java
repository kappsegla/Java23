package org.example.exercises.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "c"};
        var list = returnList(strings);

        System.out.println(list);

        String[] textArray = {"Kanon", "pankaka", "test"};
        List<String> textList = convertStringArrayToList(textArray);

        System.out.println("String lista: ");
        System.out.println(textList);
    }

    public static List<String> returnList(String[] a) {
        return List.of(a);
    }

    public static List<String> convertStringArrayToList(String[] textArray) {
        return new ArrayList<>(Arrays.asList(textArray));
    }

    private static List<String> toList(String[] string) {
        List<String> nyString = new ArrayList<>();
        Collections.addAll(nyString, string);
        return nyString;
    }

    private static List<String> toList1(String[] string) {
        List<String> nyString = new ArrayList<>();
        for (String s : string) nyString.add(s);
        return nyString;
    }
}
