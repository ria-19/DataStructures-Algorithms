package com.func;

public class MethodOverloading {
    public static void main(String[] args) {

    }


    // Two or more functions of same name can exist if they are taking different parameters; Method Overloading
    // Either the number of args should be different or the type of args should be different.
    // Java checks which one to implement at compile time.

    static void func(int a){
        System.out.println(a);
    }

    static void func(String a){
        System.out.println(a);
    }

    static void func(int a, int b){
        System.out.println("a: " + a + "b: " + b);
    }
}
