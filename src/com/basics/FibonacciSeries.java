package com.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N <= 0){
            System.out.println("Invalid Term :(");
        }
        else{
            int f0 = 0;
            int f1 = 1;
            int term = 0;

            while (N > 2){
                System.out.print(f0 + " ");
                term = f0 + f1;
                f0 = f1;
                f1 = term;
                N--;
            }
            System.out.println( f0 + " " + term);
        }
    }
}
