package com.oops;

public class Inhert {

    public static void main(String[] args) {
        int length;
        int weight;
        Child obj = new Child();
        // This constructor should initialise Child's properties as well as that are inherited, as for every object all these properties are specific.
        System.out.println(obj.weight);
    }

}

class Child extends  Inhert {
        // child class is inheriting properties from Inhert class, and can have additional properties
            // How to inherit? -> Incorporate definition of Base Class in Child Class -> using extent keyword
        int weight;

}

