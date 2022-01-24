package com.basics;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rupees = in.nextFloat();
        double dollars = rupees * 0.013;
        System.out.println(rupees + " Rupees is equal to $" + dollars);
    }
}
