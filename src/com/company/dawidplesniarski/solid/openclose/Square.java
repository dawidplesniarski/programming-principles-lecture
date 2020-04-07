package com.company.dawidplesniarski.solid.openclose;

public class Square extends Shape{
    int a;
    public Square(int a) {
        this.a = a;
    }
    @Override
    public int area() {
        return a * a;
    }
}
