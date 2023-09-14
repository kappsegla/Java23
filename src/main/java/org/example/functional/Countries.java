package org.example.functional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Countries {

    public static void main(String[] args) {
        //firstAndLast();
        //printCountryNamesSorted();
        //printCountryNamesSortedByPopulationReversed();
       //printLargestPopulation();
//        printCountriesWithMoreLettersInNameThanCapital();
//        List<Country> countries = fiveSmallestPopulations();
//        countries.forEach(System.out::println);

        collectNumberOfCountriesStartingWithSameLetter();
    }

    public static Map<String, Long> collectNumberOfCountriesStartingWithSameLetter() {
        var map = getCountries().stream()
                .collect(Collectors.groupingBy(country -> country.countryName().substring(0,1), Collectors.counting()));
        System.out.println(map);
        return map;
    }

    public static List<Country> fiveSmallestPopulations() {
        return getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population))
                .limit(5)
                .toList();
    }



    public static void printCountriesWithMoreLettersInNameThanCapital() {
        getCountries().stream()
                .filter(Countries::nameLongerThanCapital)
                .forEach(System.out::println);
    }

    public static void printLargestPopulation() {
        System.out.println(getCountries().stream()
                .mapToDouble(Country::population)
                .max().orElse(0.0));
    }

    public static void printCountryNamesSorted() {
        getCountries().stream()
                .map(Country::countryName)
                .sorted()
                .forEach(System.out::println);
    }

    public static void printCountryNamesSortedByPopulationReversed(){
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population).reversed())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    public static void firstAndLast() {

        System.out.println(getCountries().stream().findFirst().orElse(new Country("","",0,0)).countryName());

        System.out.println(getCountries().stream().reduce((first, second) -> second).orElse(new Country("","",0,0)).countryName());

        System.out.println(getCountries().stream().skip(getCountries().size() - 1).findAny().orElse(new Country("", "", 0, 0)).countryName());

    }




    public static List<Country> getCountries() {
        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykjavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160));
    }

    private static boolean nameLongerThanCapital(Country country) {
        return country.countryName().length() > country.capital().length();
    }
}
