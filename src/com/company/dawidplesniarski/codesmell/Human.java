package com.company.dawidplesniarski.codesmell;

public class Human {
    public String name;
    public String lastName;
    public int age; // publiczne pola
    public String prop; // niezrozumiała nazwa zmiennej

    public Human(String name, String lastName, int age, String prop) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.prop = prop;
    }

    // check if the data contains special characters    <- szminkowanie niezrozumiałego kodu
    boolean check(String name, String surName){ // niezrozumiała nazwa metody
        if(name.matches("[a-z]")){
            if(surName.matches("[a-z]")){   //zagnieżdżony if
                return true;
            }
        }
        return false;
    }
    // check if people adult    <- szminkowanie niezrozumiałego kodu
    boolean adult(int age){ // niezrozumiała nazwa metody
        if(age >= 18) return false; // brak klamer
        return false;
    }
}

// sklonowane klasy
class Person {
    private String name; //get set
    private String lastName; //get set
    private int age; //get set
    private String prop; //get set
}
