package com.shiny.typeinfo.factory;

public class FanBelt extends Belt {
    public static class FactoryCreator implements Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
