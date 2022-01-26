package com.func;

import java.util.Scanner;

public class FuncBasic {
    public static void main(String[] args) {
//        sum1();
//        int sum = sum2();
//        System.out.println("Sum: " + sum);
        int ans = sum3(20, 30);
        System.out.println("Sum: " + ans);
    }

//    static void sum1(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum = " + sum);
//    }

//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = in.nextInt();
//        return num1 + num2;
//    }

        static int sum3(int a, int b){
            int sum = a + b;
            return sum;
        }
    /*

        Access Modifier return_type name (parameters) {
        //body
        //return statement
        }


    */
}
