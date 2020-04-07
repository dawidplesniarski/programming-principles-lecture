package com.company.dawidplesniarski.solid.openclose;

public class Rectangle extends Shape{
    int a; //get set
    int b; //get set

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        return a * b;
    }
}
