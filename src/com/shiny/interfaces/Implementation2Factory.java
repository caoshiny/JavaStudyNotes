package com.shiny.interfaces;

public class Implementation2Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}
