package com.strings;

public class StringOp {
    public static void main(String[] args) {

        // Formatted String
        float a = 453.1234f;

        // % is place holder, %.2f represents give me upto 2 values, it rounds the result to 2 value after decimal
        // printf will be the method, for formatted printing
//        System.out.printf("Formatted number is %.2f", a);

        System.out.printf("%.3f%n", Math.PI);


        // %s for string, %.nf is for float values

        System.out.printf("hello, I'm %s and I'm %s", "Riya", "going to succeed!");

        // format specifiers
        // %c - Character
        //%d - Decimal number (base 10)
        //%e - Exponential floating-point number
        //%f - Floating-point number
        //%i - Integer (base 10)
        //%o - Octal number (base 8)
        //%s - String
        //%u - Unsigned decimal (integer) number
        //%x - Hexadecimal number (base 16)
        //%t - Date/time
        //%n - Newline


    }
}
