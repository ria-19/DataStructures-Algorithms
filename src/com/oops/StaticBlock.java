package com.oops;

public class StaticBlock {
    static int a = 4;
    static int b;

    // How to initialise static variable?
    // It is done using static which will initialise variables, and will run only once when the class is loaded.
    static {
        System.out.println("I'm in static block");
        b = a * 5;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
