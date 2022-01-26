package com.FunQues;

import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = sumn(n);
        System.out.println(sum);
    }

    static int sumn(int n) {
        int res = 0;
        if (n < 0){
            return -1;
        }
        else{
            res = (n * (n + 1) / 2);
        }
        return res;
    }
}
