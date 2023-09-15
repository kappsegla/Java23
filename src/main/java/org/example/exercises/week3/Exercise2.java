package org.example.exercises.week3;

import java.util.Arrays;

public class  Exercise2 {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Orange", "Grape fruit"};
        String[] editedArr = removeElement(fruit, 1);
        System.out.println(Arrays.toString(editedArr));
    }

    //Only works for Strings not containing the special split character %.
    public static String[] removeIndexFromArray(String[] str, int index) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (i == index)
                continue;
            a.append(str[i] + "%");
        }
        return a.toString().split("%");
    }

    public static String[] removeElement(String[] array, int index) {
        if ( index < 0 || index >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        String[] newArray = new String[array.length -1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (i != index){
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }
}
