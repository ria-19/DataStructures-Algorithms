package com.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
//        super(); not specified then default one will be called; that is super() -> Box()
        this.weight = -1;
    }

//
//    public BoxWeight(double side, double weight) {
//        super(side);
//        this.weight = weight;

    // Child cares about what parent class contains hence super should be defined first then it's own things
//    }
//
    public BoxWeight(double l, double h, double w, double weight) {

        // In order to set this value, it has to initialise this value in the parent class ->  super() -> calls the parent class constructor
        super(l, h, w); // we can pass values for private parent class members but cannot see them, they will initialise because parent's class constructor is called and hence have access.
        this.weight = weight;
        System.out.println(super.h); // specifies h in the parent class
        System.out.println(this.h); // will also work but if h is present in child also it points to it
    }
//
//    public BoxWeight(Box old, double weight) {
//        super(old);
//        this.weight = weight;
//    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
}


    // Parent class object cannot use child's class properties
}
