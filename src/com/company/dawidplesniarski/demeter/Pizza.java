package com.company.dawidplesniarski.demeter;

public class Pizza {
    private PizzaType pizzaType;


    public Pizza(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
    Double getPizzaPrice(){
        return pizzaType.getPrice();
    }

    AnotherPizza getAnotherPizza(){
        AnotherPizza anotherPizza = new AnotherPizza();
        return anotherPizza;
    }
}
