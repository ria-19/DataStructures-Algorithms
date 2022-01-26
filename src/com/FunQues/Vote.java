package com.FunQues;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        eligible(age);
    }

    static void eligible(int age) {
        if (age <= 0){
            System.out.println("Invalid Age");
        }
        else if (age < 18){
            System.out.println("Sorry, you can't vote.");
        }
        else {
            System.out.println("You can vote!!");
        }
    }
}
