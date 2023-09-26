package org.example.list;
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("1");
        strings.add("2");
        strings.add("2");
        strings.add("3");

        String first = strings.get(0);
        System.out.println(first);
        String last = strings.get( strings.size() -1 ); //Up to java20
        System.out.println(last);
        last = strings.getLast();
        System.out.println(last); //From java21 SequencedCollection
        System.out.println();
        strings.forEach(System.out::println);

        Set<String> stringSet = new HashSet<>();

        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("Aa");
        stringSet.add("BB");

        System.out.println();

        stringSet.forEach(System.out::println);

        Deque<String> deque = new ArrayDeque<>();

        deque.push("1");
        deque.push("2");
        deque.push("3");
        deque.add("4");
        System.out.println();
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());




    }
}
