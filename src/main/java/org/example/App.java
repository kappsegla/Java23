package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

import static org.example.Utils.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();

        person1.name = scanner.nextLine();
        person1.age = scanner.nextInt();
        
        Person person2 = new Person();
        person2.name = scanner.nextLine();
        person2.age = scanner.nextInt();

        System.out.println(person1.name + ":" + person1.age);
        


    }

    public static boolean afterLunch() {
        return LocalDateTime.now().getHour() >= 12;
    }
}
