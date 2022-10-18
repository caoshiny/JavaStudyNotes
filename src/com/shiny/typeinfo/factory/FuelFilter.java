package com.shiny.typeinfo.factory;

public class FuelFilter extends Filter {
    public static class FactoryCreator implements Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
