package com.basics;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2){
            System.out.println("Large: " + num1);
        }
        else if (num2 > num1){
            System.out.println("Large: " + num2);
        }
        else{
            System.out.println("Equal");
        }
    }
}
