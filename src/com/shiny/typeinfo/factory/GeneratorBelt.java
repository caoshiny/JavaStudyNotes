package com.shiny.typeinfo.factory;

public class GeneratorBelt extends Belt{
    public static class FactoryCreator implements Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
