package org.example.files;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonFile {
    /*
    Needs the following dependency in pom.xml under dependencies
            <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.15.1</version>
        </dependency>


     */

    public static void main(String[] args) throws IOException {
        Path path = Path.of(System.getProperty("user.home"), "list.json");

        List<Cake> list = new ArrayList<>();
        list.add(new Cake(1, "Test", 100));
        list.add(new Cake(2, "Test2", 200));
        list.add(new Cake(3, "Test3", 300));

        new ObjectMapper().writeValue(Files.newOutputStream(path), list);

        var result = new ObjectMapper().readValue(Files.newInputStream(path), Cake[].class);

        System.out.println(Arrays.toString(result));
    }
}
