package com.shiny.typeinfo.factory;

public class AirFilter extends Filter {
    public static class FactoryCreator implements Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
