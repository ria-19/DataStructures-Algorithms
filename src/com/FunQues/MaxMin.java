package com.FunQues;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        max(a, b , c);
        min(a, b, c);
    }

    static void max(int a, int b, int c){
        int maxN = a;
        if (b > maxN){
            maxN = b;
        }
        if (c > maxN){
            maxN = c;
        }
        System.out.println("Max: " + maxN);
    }

    static void min(int a, int b, int c){
        int minN = a;
        if (b < minN){
            minN = b;
        }
        if (c  < minN){
            minN = c;
        }
        System.out.println("Min: " + minN);
    }
}
