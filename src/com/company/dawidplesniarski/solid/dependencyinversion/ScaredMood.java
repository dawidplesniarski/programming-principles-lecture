package com.company.dawidplesniarski.solid.dependencyinversion;

public class ScaredMood implements Mood {
    @Override
    public void writeSomething() {
        System.out.println("I'm scared! 🙀");
    }
}
