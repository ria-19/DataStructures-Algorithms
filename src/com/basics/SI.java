package com.basics;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = input.nextInt();
        System.out.print("Rate: ");
        float rate = input.nextFloat();
        System.out.print("Years: ");
        float time = input.nextFloat();
        float si = principal * (rate / 100) * time;
        System.out.println("Simple Interest on " + principal + " at " + rate + " for " + time + " is " + si);
    }
}
