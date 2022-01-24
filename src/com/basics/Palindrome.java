package com.basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String text = input.nextLine();
        int first = 0;
        int last = text.length() - 1;
        while (first < last){
            if (text.charAt(first) != text.charAt(last)){
                System.out.println("Not a Palindrome!!");
                break;
            }
            first++;
            last--;
        }
       if (first >= last){
           System.out.println("Palindrome!");
       }

    }
}
