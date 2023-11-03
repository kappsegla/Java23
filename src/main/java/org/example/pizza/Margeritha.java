package org.example.pizza;

import java.util.ArrayList;
import java.util.List;

public class Margeritha extends Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public List<String> getDescription() {
        return new ArrayList<>(List.of("ost", "tomatsås", "oregano"));
    }
}
