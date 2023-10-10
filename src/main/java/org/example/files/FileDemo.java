package org.example.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileDemo {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        Path path = Path.of(userHome, "readme.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));
        System.out.println(Files.exists(Path.of(userHome)));
//        try {
//            if (!Files.exists(path)) {
//                Files.createFile(path);
//            }
//        } catch (IOException e) {
//            System.out.println("Couldn't create file: " + e.getMessage());
//        }
        try (Stream<String> stringStream = Files.lines(path)) {
            //Files.writeString(path, "Hello there, åäö\n");
            //Files.writeString(path, "Hello there, åäö\n", StandardOpenOption.APPEND);
            //String fileContent = Files.readString(path);
            //System.out.println(fileContent);
            stringStream.filter(s -> !s.startsWith("G")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Couldn't access file: " + e.getMessage());
        }
    }
}
