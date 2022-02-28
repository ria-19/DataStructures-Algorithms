package com.polymorphism;

public class Numbers {
    int sum (int a, int b){
        return a + b;
    }

    int sum (String a, int b){
        return b;
    }

    int sum (int a , String b){
        return a;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
//        int val = num.sum(2,3);
//        int val = num.sum("hey", 2);
//        int val = num.sum(2, "hey");
    }
}
