package com.company.dawidplesniarski.drycode;

import com.company.dawidplesniarski.solid.EngineType;

public class Motorcycle extends Vehicle{
    String typeOfDrive;
    public Motorcycle(String mark, String model, Integer productionYear,
                      String vinNumber, EngineType engineType, String typeOfDrive) {
        super(mark, model, productionYear, vinNumber, engineType);
        this.typeOfDrive = typeOfDrive;
    }
}
