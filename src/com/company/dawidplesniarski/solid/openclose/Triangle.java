package com.company.dawidplesniarski.solid.openclose;

public class Triangle extends Shape {
    int a;
    int h;
    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public int area() {
        return (a * h)/2;
    }
}
