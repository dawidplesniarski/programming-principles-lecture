package com.company.dawidplesniarski.solid.dependencyinversion;

public class GoodMood implements Mood {
    @Override
    public void writeSomething() {
        System.out.println("I have good mood! 😁");
    }
}
