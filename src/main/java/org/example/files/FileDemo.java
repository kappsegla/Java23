package org.example.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;

public class FileDemo {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        Path path = Path.of(userHome, "readme.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));
        System.out.println(Files.exists(Path.of(userHome)));
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            System.out.println("Couldn't create file: " + e.getMessage());
        }
        try {
            Files.writeString(path, "Hello there, åäö\n");
            //Files.writeString(path, "Hello there, åäö\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Couldn't write to file: " + e.getMessage());
        }


    }
}
