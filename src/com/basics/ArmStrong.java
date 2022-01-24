package com.basics;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 0){
            System.out.println("Checks only for positive numbers!");
        }
        else{
            int sum = 0;
            int num1 = num;
            int order = (int) Math.log10(num) + 1;
            System.out.println("Order: "+ order);
            while (num > 0){
                sum +=  (int) Math.pow((num % 10), order);
                num /= 10;
            }
//            System.out.println("Sum: "+ sum + " " + "Num: " + num1 + "" + "Order: "+ order);
            if (sum == num1){
                System.out.println("Armstrong Number");
            }
            else{
                System.out.println("Not an Armstrong Number");
            }
        }
    }
}
