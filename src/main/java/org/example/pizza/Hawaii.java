package org.example.pizza;

import java.util.ArrayList;
import java.util.List;

public class Hawaii extends Pizza{
    @Override
    public int getCost(){
        return 110;
    }
    @Override
    public List<String> getDescription(){
        return new ArrayList<>(List.of("ost", "tomatsås", "🍍"));
    }
}
