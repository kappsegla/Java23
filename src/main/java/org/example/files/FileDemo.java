package org.example.files;

import java.nio.file.Path;

public class FileDemo {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        Path path = Path.of(userHome, "readme.txt");
        System.out.println(path);
        System.out.println(java.nio.file.Files.exists(path));

    }
}
