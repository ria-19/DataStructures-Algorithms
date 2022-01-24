package com.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String res = "Odd";
        if (num % 2 == 0){
            res = "Even";
            System.out.println("Num is: " + res);
        }
        else {
            System.out.println("Num is: " + res);
        }
    }
}
