package com.FunQues;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();
        String grade = calcGrade(marks);
        System.out.println("Your grade is: " + grade);
    }

    static String calcGrade(float marks) {
        if (marks < 0){
            System.out.println("Invalid Marks");
            return "nil";
        }
        else if (marks <= 40){
            return "Fail";
        }
        else if (marks <= 50){
            return "DD";
        }
        else if (marks <= 60){
            return "CD";
        }
        else if (marks <= 70){
            return "BC";
        }
        else if (marks <= 80){
            return "BB";
        }
        else if (marks <= 90){
            return "AB";
        }
        else {
            return "AA";
        }
    }
}
