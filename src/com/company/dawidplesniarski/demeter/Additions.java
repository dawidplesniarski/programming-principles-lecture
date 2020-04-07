package com.company.dawidplesniarski.demeter;

public enum Additions {
    Salami(5.),
    DoubleCheese(3.),
    GarlicSauce(1.),
    Ketchup(0.5);

    private Double additionPrice;

    Additions(Double additionPrice) {
        this.additionPrice = additionPrice;
    }

    public Double getAdditionPrice() {
        return additionPrice;
    }
}
