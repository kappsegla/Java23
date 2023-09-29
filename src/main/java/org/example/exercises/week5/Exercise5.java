package org.example.exercises.week5;

import java.util.*;

public class Exercise5 {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input= scanner.nextLine();
            capital(input);

        }
        public static void capital(String input){
            Map<String, String> country = new HashMap<>();
            //var country = Map.of("sweden","Stockholm","germany","Berlin");
            country.put("sweden","Stockholm");
            country.put("germany","Berlin");
            country.put("iran","Tehran");
            country.put("canada","Ottawa");
            country.put("mexico","Mexico city");
            country.put("netherlands","Amsterdam");
            country.put("norway","Oslo");
            input=input.toLowerCase();
            System.out.println(country.get(input));
        }
}
