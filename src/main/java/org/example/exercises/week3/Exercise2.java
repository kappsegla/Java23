package org.example.exercises.week3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class  Exercise2 {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Orange", "Grape fruit", "Banana"};
        String[] editedArr = removeElement(fruit, 1);
        System.out.println(Arrays.toString(editedArr));
        String[] editedArr2 = removeElement(fruit, "Banana");
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

    public static String[] removeElement(String[] array, String wordToRemove){
        int indexOfEditedArr = array.length;
        for(String s : array){
            if(s.equalsIgnoreCase(wordToRemove)){
                indexOfEditedArr --;
            }
        }
        String [] editedString = new String[indexOfEditedArr];
        int newIndex = 0;
        for(String word : array){
            if(!word.equalsIgnoreCase(wordToRemove)){
                editedString[newIndex] = word;
                newIndex++;
            }
        }
        return editedString;

    }

    
    public static String[] removeString(String[] array, String stringToRemove) {
        return Arrays.stream(array)
                .filter(string -> !string.equals(stringToRemove))
                .toArray(String[]::new);
    }
    public static String[] removeString(String[] array, int index) {
        return IntStream.range(0, array.length)
                .filter(i -> i != index)
                .mapToObj(i -> array[i])
                .toArray(String[]::new);
    }


}
