package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes obj = new Circle();
        obj.area();  // ran circle's area() why?
        // error if area is not present in Shapes why?

    }
}
