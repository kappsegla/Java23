package org.example.exercises.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Movie {

    private final String title;
    private final Director director;
    private final String[] actors;
    private final ArrayList<String> reviews = new ArrayList<>();

    public Movie(String title, Director director, String[] actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public String[] getActors() {
        return Arrays.copyOf(actors, actors.length);
    }

    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void setReview(String text) {
        reviews.add(text);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("From Kalmar with Love", new Director("Martin"), new String[]{"Kalle", "Anna"});
        movie.setReview("Jolly good movie");
        movie.setReview("Worst movie ever");

//        List<String> reviews = movie.getReviews();
//        reviews.clear();
//        reviews.add("Hacker");


        System.out.println(movie.getReviews());
    }
}
