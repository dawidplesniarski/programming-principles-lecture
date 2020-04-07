package com.company.dawidplesniarski.drycode;

import com.company.dawidplesniarski.solid.EngineType;

public class Vehicle {
    String mark;
    String model;
    Integer productionYear;
    String vinNumber;
    EngineType engineType;

    public Vehicle(String mark, String model, Integer productionYear,
                   String vinNumber, EngineType engineType) {
        this.mark = mark;
        this.model = model;
        this.productionYear = productionYear;
        this.vinNumber = vinNumber;
        this.engineType = engineType;
    }
}

