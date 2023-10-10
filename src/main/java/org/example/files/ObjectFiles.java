package org.example.files;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ObjectFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(System.getProperty("user.home"),"list.bin");

        List<Cake> list = new ArrayList<>();
        list.add(new Cake(1,"Test",100));
        list.add(new Cake(2,"Test2",200));
        list.add(new Cake(3,"Test3",300));
        try (ObjectOutputStream oos = new
                ObjectOutputStream(Files.newOutputStream(path))) {
            // handle objectoutputstream
            oos.writeObject(list);
        }
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))) {
            // handle objectoutputstream
            list = (List<Cake>) oos.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
