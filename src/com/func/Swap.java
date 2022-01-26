package com.func;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap in Java
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Natasha";
        System.out.println(name);
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String name) {
        name = "Kathlina";
    }

    // Will not swap values of a and b in main(), changes will occur in swap()
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
