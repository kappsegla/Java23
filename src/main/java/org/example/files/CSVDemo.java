package org.example.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class CSVDemo {
    public static void main(String[] args) {
        var home = System.getProperty("user.home");
        Path path = Path.of(home, "cakes.csv");
        List<Cake> cakes = List.of();
        try (Stream<String> lines = Files.lines(path)) {

            cakes = lines.skip(1)
                    .map(s -> s.split(","))
                    .map(CSVDemo::convert)
                    .toList();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        cakes.forEach(System.out::println);

    }

    private static Cake convert(String[] sa) {
        return new Cake(Integer.parseInt(sa[0].trim()), sa[1], Integer.parseInt(sa[2].trim()));
    }
}
