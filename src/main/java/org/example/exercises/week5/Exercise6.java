package org.example.exercises.week5;

import java.util.*;
import java.util.function.BiFunction;

public class Exercise6 {

    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Hej hur mår du.");
        text.add("Hej jag mår bra.");
        text.add("Jag kommer innan tre. Jag måste hem sen.");
        var map = textToOrd(text);
        System.out.println(map);

        System.out.println(map.get("mår"));


    }

    public static Map<String, Set<Integer>> textToOrd(List<String> stringList) {
        Map<String, Set<Integer>> stringCounter = new HashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] ordlist = stringList.get(i).split(" ");
            final int index = i;
            for (String s : ordlist) {
                var wordKey = s.replace(".", "");
//                Set<Integer> indexNumber = stringCounter.getOrDefault(wordKey, new HashSet<>());
//                indexNumber.add(i);
//                stringCounter.put(wordKey, indexNumber);
                // stringCounter.compute(wordKey, createOrUpdateSet(index));
                stringCounter.merge(wordKey,
                        new HashSet<>(Collections.singleton(index)),
                        Exercise6::mergeSets);
            }
        }
        return stringCounter;
    }

    private static Set<Integer> mergeSets(Set<Integer> next, Set<Integer> current) {
        next.addAll(current);
        return next;
    }


    private static BiFunction<String, Set<Integer>, Set<Integer>> createOrUpdateSet(int index) {
        return (k, v) -> {
            if (v == null)
                return new HashSet<>(Set.of(index));
            else
                v.add(index);
            return v;
        };
    }
}
