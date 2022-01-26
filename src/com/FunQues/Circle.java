package com.FunQues;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        circle(radius);
    }

    static void circle(double r){
        double areaC = Math.PI * Math.pow(r, 2);
        double perimeterC = 2 * Math.PI * r;
        System.out.println("Area: " + areaC + " Perimeter: " + perimeterC);
    }
}
