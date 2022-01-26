package com.FunQues;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = sum(a, b);
        int product  = product(a, b);
        System.out.println("Sum: " + sum + " Product: " + product);
    }
    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static int product(int num1, int num2){
        return num1 * num2;
    }
}
