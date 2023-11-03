package org.example.pizza;

public class Hawaii extends Pizza{
    @Override
    public int getCost(){
        return 110;
    }
    @Override
    public String getDescription(){
        return "Skinka, ost, tomatsås, ananas";
    }
}
