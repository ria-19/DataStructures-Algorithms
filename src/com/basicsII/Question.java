package com.basicsII;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

//        Sum and Product of digits of any number
        int product = 1;
        int sum = 0;
        while (N > 0){
            sum += N % 10;
            product *= N % 10;
            N /= 10;
        }
        System.out.println("Sum: " + sum + " Product: " + product);

// Input a number and print all the factors of that number (use loops).
        int i = 1;
        while (i * i <= N){
            if (N % i == 0){
                if(N / i == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i + " " + (N / i) + " ");
                }
            }
            i++;
        }
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int sum = 0;
        while (N != 0){
            sum += N;
            N = in.nextInt();
        }
        System.out.println("Sum: " + sum);
// Take integer inputs till the user enters 0 and print the largest number from all.
        int largest = N;
        while (N != 0){
            N = in.nextInt();
            if (N > largest){
                largest = N;
            }
        }
        System.out.println("Sum: " + largest);
    }
}
