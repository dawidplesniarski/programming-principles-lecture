package com.company.dawidplesniarski.solid.liskov;

import java.util.Collection;

public class DoSomethingWithCollection {

    public static void printCollection(Collection<String> someCollection){
        someCollection.stream()
                .forEach(System.out::println);
    }
}
