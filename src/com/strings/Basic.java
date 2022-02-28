package com.strings;

public class Basic {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        // There are two ways, we can compare strings
        // 1. == : Comparator
        System.out.println(a == b);  // True
        // This checks if both the reference variable points to the same object in the heap.


        // How to create a new string object?
        String name = new String("Java");
        // This will create two Java Objects, one in String Pool if it does not exist, and one in heap outside of Pool.
        String name2 = "Java";
        System.out.println(name == name2); // False
        // Should give false they are two different objects, one in Pool and other outside of Pool
        System.out.println(a == name2);

        // How to only check the value, using .equals() method
        System.out.println(a.equals(name));
        System.out.println(a.equals(b));
        System.out.println(name.equals(name2));


    }

}
