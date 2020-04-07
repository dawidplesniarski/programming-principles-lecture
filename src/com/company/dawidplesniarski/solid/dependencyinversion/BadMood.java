package com.company.dawidplesniarski.solid.dependencyinversion;

public class BadMood implements Mood {
    @Override
    public void writeSomething() {
        System.out.println("I have bad mood! 😞");
    }
}
