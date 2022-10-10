package com.shiny.detect;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public void g() {
        System.out.println("public g()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
        po.g();
    }
}
