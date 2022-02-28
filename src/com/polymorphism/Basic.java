package com.polymorphism;

public class Basic {
    // Polymorphism -> many ways to represent a single entity ->
    // A task can be performed in many ways
    // How it occurs?
    // Why do we need it?
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();


    }



}
