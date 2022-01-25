package com.basicsII;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        Largest Number
        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int num3 = in.nextInt();
//        int max = num1;
//        if (num2 > max){
//            max = num2;
//        }
//        if (num3 > max){
//            max = num3;
//        }
//        System.out.println("Largest: " + max);

// Case Check
//        char ch = in.next().trim().charAt(0);
//
////        Compares ch (int value)  with the integer values of 'z', 'a'
//        if (ch <= 'z' && ch >= 'a'){
//            System.out.println("LowerCase!");
//        }
//        else{
//            System.out.println("UpperCase!");
//        }

//        Occurrence
//        int N = in.nextInt();
//        int find = in.nextInt();
//        int count = 0;
//        while (N > 0){
//            int temp = N % 10;
//            N /= 10;
//            if (temp == find){
//                count++;
//            }
//        }
//        System.out.println("Count: " + count);
//
// reverse a number
//        Using Strings
        int N = in.nextInt();
//        String str = String.valueOf(N);
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev += str.charAt(i);
//        }
//        System.out.println("Reverse: " + rev);

//        Without using Strings
        int res = 0;
        while (N > 0){
            int rem = N % 10;
            res = res * 10 + rem;
            N /= 10;
        }
        System.out.println("Reverse: " + res);

    }
}
