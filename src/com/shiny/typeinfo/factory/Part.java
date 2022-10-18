package com.shiny.typeinfo.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 注册工厂设计模式
 */
public class Part {
    public String toString() {
        return this.getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();

    static {
        partFactories.add(new FuelFilter.FactoryCreator());
        partFactories.add(new AirFilter.FactoryCreator());
        partFactories.add(new CabinAirFilter.FactoryCreator());
        partFactories.add(new OilFilter.FactoryCreator());
        partFactories.add(new FanBelt.FactoryCreator());
        partFactories.add(new PowerSteeringBelt.FactoryCreator());
        partFactories.add(new GeneratorBelt.FactoryCreator());
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
