package com.func;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Prime: " + isPrime(N));

    }

    static boolean isPrime(int N){
        boolean res = true;
        int i = 2;
        while (i * i <= N){
            if (N % i == 0){
                res = false;
                break;
            }
            i++;
        }
        return res;
    }

    

}
