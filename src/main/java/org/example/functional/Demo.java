package org.example.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        final int k = 1;
        Function<Integer, String> methodImpl = (value) -> String.valueOf(value + k);

        printInformation(methodImpl);
        printInformation(i -> String.valueOf(i * 2));
        printInformation(Demo::convert);

        Demo demo = new Demo();
        printInformation(demo::nonStatic);

        List<String> strings = new ArrayList<>(List.of("b", "a", "bh"));

        strings.sort(Comparator.naturalOrder());

        strings.forEach(System.out::println);

        List<String> immutableStrings = List.of("Hej", "Då");
        //immutableStrings.add("Kalle");

        var unmodifiableList = Collections.unmodifiableList(strings);
        //unmodifiableList.add("c");

        var result = strings.stream()
                .filter(s -> s.startsWith("b"))
                .toList();

//        result.add("");
    }

    public static void printInformation(Function<Integer, String> function) {
        System.out.println(function.apply(10));
    }

    public static String convert(Integer i) {
        return String.valueOf(i - 2);
    }

    public String nonStatic(Integer i) {
        return String.valueOf(i - 2);
    }


}
//class UnmodifiableList<T> implements List<T> {
//
//    private final List<T> list;
//
//    UnmodifiableList(List<T> list) {
//        this.list = list;
//    }
//
//    @Override
//    public int size() {
//        return list.size();
//    }
//
//    @Override
//    public boolean add(T t) {
//        throw new UnsupportedOperationException();
//    }
//}
