package com.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String name = "abcdcba";
        int i = 0, j = name.length() - 1;
        while(i < j){
            if (name.charAt(i) != name.charAt(j)){
                System.out.println("NO");
                break;
            }
            i++;
            j--;
        }
        System.out.println("YES");


    }
}
