package org.example.exercises.week3;

import org.example.exercises.week2.Exercise4;

public class MultiLanguageProgram {

    public static void main(String[] args) {
        Language language;
        Exercise4 reader = new Exercise4();

        String menu1 = """
                Tryck 1 för Svenska
                Press 2 for English
                """;

        System.out.println(menu1);
        String choice = reader.readString(new String[] {"1","2"});

        if( choice.equals("1"))
            language = new Swedish();
        else
            language = new USEnglish();

        System.out.println(language.greeting());
        System.out.println(language.ok());







    }

}
