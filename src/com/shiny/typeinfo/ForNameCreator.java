package com.shiny.typeinfo;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "com.shiny.typeinfo.Mutt",
            "com.shiny.typeinfo.Pug",
            "com.shiny.typeinfo.EgyptianMau",
            "com.shiny.typeinfo.Manx",
            "com.shiny.typeinfo.Cymric",
            "com.shiny.typeinfo.Rat",
            "com.shiny.typeinfo.Mouse",
            "com.shiny.typeinfo.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {loader();}

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
