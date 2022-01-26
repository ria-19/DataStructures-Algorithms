package com.FunQues;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        allPrime(num1, num2);
    }

    static void allPrime(int num1, int num2) {
        int s = Math.min(num1, num2);
        int e = Math.max(num1, num2);
        for (int i = s; i <= e; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
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
