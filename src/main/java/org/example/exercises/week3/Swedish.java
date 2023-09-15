package org.example.exercises.week3;


import java.util.Locale;

public class Swedish extends Language {

    @Override
    public java.util.Locale getLocale() {
        return Locale.of("sv","SE");
    }

    public String greeting() {
        return "Hej";
    }

    public String ok() {
        return "okej";
    }

    public String cancel() {
        return "avbryt";
    }

    public String tryAgain() {
        return "Försök igen";
    }
}
