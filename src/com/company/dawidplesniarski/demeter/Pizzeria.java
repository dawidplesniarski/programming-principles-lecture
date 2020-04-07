package com.company.dawidplesniarski.demeter;

public class Pizzeria {

    private Additions addition;

    public void newPizza(Pizza pizza){
        double pizzaPrice;
        double additionPrice;
        double totalPrice;
        // Możemy odwoływać się do własnych metod
        sayHelloToCustomer();
        //Możemy wywołać metody obiektów które stworzymy w klasie
        addition = Additions.Salami;
        additionPrice = addition.getAdditionPrice();
        // Możemy wywoływać metodę z obiektu podanego w metodzie
        pizzaPrice = pizza.getPizzaPrice();

        // Złamanie prawa demeter
        pizza.getAnotherPizza().getAnotherAnotherPizza(); // obiekt A rozmawia z obiektem B oraz C

        totalPrice = pizzaPrice + additionPrice;
        System.out.println("Total price" + totalPrice);
    }
    void sayHelloToCustomer(){ System.out.println("Welcome to our restaurant!"); }
}
