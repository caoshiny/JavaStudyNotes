package com.shiny.typeinfo.factory;

public class CabinAirFilter extends Filter {
    public static class FactoryCreator implements Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
