package com.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    // if private double l;  was defined ; then subclass would not be able to access that.

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(double side) {
//        super(); -> Object class constructor
        this.l = side;
        this.h = side;
        this.w = side;


    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box!" );
    }
}



