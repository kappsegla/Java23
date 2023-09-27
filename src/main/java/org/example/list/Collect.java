package org.example.list;

import org.example.utils.BooleanUtils;

import java.util.*;

public class Collect {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        List<Phone> immutablePhoneList = List.of(new Phone(1, "Motorola", 4));

        phones.add(new Phone(2, "Sony", 8));
        phones.add(new Phone(1, "Sony", 12));
        phones.add(new Phone(67, "Apple", 8));
        phones.add(new Phone(4, "OnePlus", 16));

        //Worst case search, O(n)
        //for (int i = 0; i < phones.size(); i++) {
        //    if( phones.get(i).id() ==  67)
        // System.out.println(phones.get(i));
        //}

        Map<Long, Phone> phoneMap = new HashMap<>();

        phoneMap.put(2L, new Phone(2, "Sony", 8));
        phoneMap.put(1L, new Phone(1, "Sony", 12));
        phoneMap.put(67L, new Phone(67, "Apple", 8));
        phoneMap.put(4L, new Phone(4, "OnePlus", 16));

        //Medeltiden det tar att hitta en key är O(1)
        System.out.println(phoneMap.get(67L));

        phoneMap.forEach((k, v) -> System.out.println(k + ":" + v));

        if (!phoneMap.containsKey(1L))
            phoneMap.put(1L, new Phone(1, "Test", 2));

        phoneMap.putIfAbsent(1L, new Phone(1, "Test", 2));

        phoneMap.getOrDefault(1L, new Phone(0,"Placeholder", 0));

        //list(phones);
    }

    private static void list(List<Phone> phones) {
        if (not(phones.isEmpty()))
            System.out.println(phones.get(0));

        //Custom class com.example.utils.BooleanUtils, statically imported
        if (BooleanUtils.not(phones::isEmpty))
            System.out.println(phones.get(0));

        for (var phone : phones) {
            System.out.println(phone);
        }

        phones.forEach(System.out::println);
        phones.forEach(phone -> System.out.println(phone.make()));
        phones.forEach(Collect::printPhoneMake);

        System.out.println(phones.contains(new Phone(1, "Sony", 8)));
        System.out.println(phones.indexOf(new Phone(1, "Sony", 8)));
    }

    public static void printPhoneMake(Phone phone) {
        System.out.println(phone.make());
    }

    public static boolean not(boolean input) {
        return !input;
    }
}

record Phone(long id, String make, int memory) {
}
