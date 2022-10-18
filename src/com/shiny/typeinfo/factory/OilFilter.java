package com.shiny.typeinfo.factory;

public class OilFilter extends Filter {
    public static class FactoryCreator implements Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
