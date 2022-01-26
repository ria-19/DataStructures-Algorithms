package com.FunQues;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        printFact(N);
    }

    static void printFact(int n) {
        int res = 1;
        if (n < 0){
            res = 0;
        }
        else{
            int count = 1;
            while (count <= n) {
                res *= count;
                 count++;
            }
        }
        System.out.println(res);
    }


}
