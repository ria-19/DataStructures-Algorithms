package com.basicsII;

import java.util.Scanner;

// Calculator using For Loop
public class CalculatorLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//         Take the input from user till user does not press q or Q
        int ans = 0;
        while (true){
            char op = in.next().trim().charAt(0);
            if (op == 'q' || op == 'Q'){
                break;
            }
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (op == '+'){
                ans = num1 + num2;
            }
            else if (op == '-'){
                ans = num1 - num2;
            }
            else if (op == '*'){
                ans = num1 * num2;
            }
            else if (op == '/'){
                if (num2 != 0){
                    ans = num1 / num2;
                }
                else{
                    System.out.println("Invalid Division");
                }
            }
            else if (op == '%'){
                ans = num1 % num2;
            }
            else {
                System.out.println("Invalid Operator");
            }

        }
        System.out.println("Result: " + ans);
    }
}
