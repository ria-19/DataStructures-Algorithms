package com.strings;


import java.util.Arrays;

public class Output {
    public static void main(String[] args) {

        System.out.println(56);  // It calls toString() method, string representation of that type.

        // For Integer, internally println is calling String.valueOf() -> Integer.toString() method.


        System.out.println("ABS");

        // For String also, similar thing happens , it checks if null is there, if not internally converts the reference into the object's textual representation

        System.out.println(new int[] {2,3,4});
        System.out.println(Arrays.toString(new int[] {2,3,4}));

        // It gives some hexadecimal code, it gives string representation of that reference,
        //In all wrapper classes, all collection classes, String class, StringBuffer, StringBuilder classes toString() method is overriden for meaningful String representation. Hence, it is highly recommended to override toString() method in our class also



        String name = null;
        System.out.println(name);


        //Here, println is implemented differently for different type of argument, function/method overloading takes place to handle and print
        // different type of data differently.

        // For Wrapper classes
        Integer num = new Integer(56);
        System.out.println(num);
//        System.out.println(num.toString());
        // Unnecessary toString() because they already call that method internally, and it is overridden to give valuable information

    }
}
