package com.kb.biological;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>>types = new ArrayList<>();
    private static String[] typeNames = {"com.kb.biological.Mutt",
            "com.kb.biological.Pug",
            "com.kb.biological.EgyptianMau",
            "com.kb.biological.Manx",
            "com.kb.biological.Cymric",
            "com.kb.biological.Rat",
            "com.kb.biological.Mouse",
            "com.kb.biological.Hamster"};
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    private static void loader(){
        try {
            for (String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
    }

    static {
        loader();
    }
}
