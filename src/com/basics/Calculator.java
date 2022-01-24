package com.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Operator: ");
        String op = in.next();

        System.out.print("Num1: ");
        float num1 = in.nextFloat();

        System.out.print("Num2: ");
        float num2 = in.nextFloat();

        if (op.equals("+")){
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));
        }
        else if (op.equals("-")){
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));
        }
        else if (op.equals("*")){
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2));
        }
        else if (op.equals("d")){
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 / num2));
        }
        else if (op.equals("%")){
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 % num2));
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}
