package com.shiny.typeinfo.factory;

public class PowerSteeringBelt extends Belt {
    public static class FactoryCreator implements Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
