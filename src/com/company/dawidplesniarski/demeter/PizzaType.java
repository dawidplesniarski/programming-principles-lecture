package com.company.dawidplesniarski.demeter;

public enum PizzaType {
    Margerita(15.),
    Funghi(17.),
    Quattroformaggi(25.),
    Capriciossa(30.),
    Diavolo(31.);

    private Double price;

    PizzaType(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        System.out.println(price);
        return price;
    }
}
