package org.example.list;

import org.example.utils.BooleanUtils;

import java.util.ArrayList;
import java.util.List;

public class Collect {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        List<Phone> immutablePhoneList = List.of(new Phone("Motorola", 4));

        phones.add(new Phone("Sony", 8));
        phones.add(new Phone("Sony", 8));
        phones.add(new Phone("Apple", 8));
        phones.add(new Phone("OnePlus", 16));

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

        System.out.println(phones.contains(new Phone("Sony", 8)));
        System.out.println(phones.indexOf(new Phone("Sony", 8)));
    }

    public static void printPhoneMake(Phone phone) {
        System.out.println(phone.make());
    }

    public static boolean not(boolean input) {
        return !input;
    }
}

record Phone(String make, int memory) {
}
