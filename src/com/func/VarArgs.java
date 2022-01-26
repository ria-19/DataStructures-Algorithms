package com.func;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(1, 2, 3,4,5);
        func();
        func(23, 4,11);
        multiple(1, 2, "a", "b", "c");
    }


    // We don't know about how many integers are going to be passed in this func, hence using int ...v
    // It means variable length array of ints, which can be accessed via v
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // Variable length arguments always should be in the end!!
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
