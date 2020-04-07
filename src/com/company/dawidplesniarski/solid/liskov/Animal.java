package com.company.dawidplesniarski.solid.liskov;

abstract class Animal {
    String name; //get set
    public abstract void runAnimal();
}

class Dog extends Animal{

    String name; //get, set
    @Override
    public void runAnimal() {
        System.out.println("The dog is running 🐶‍");
    }
}

class Fish extends Animal{
    String name; //get set
    @Override
    public void runAnimal() {
        System.out.println("The fish cannot run :( 🐠");
    }
}
