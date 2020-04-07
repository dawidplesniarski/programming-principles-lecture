package com.company.dawidplesniarski.solid.dependencyinversion;

public class MoodLogic {
    public static void doSomething(Mood mood){
        mood.writeSomething();
    }
}
