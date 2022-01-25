package com.basicsII;

import java.util.Objects;
import java.util.Scanner;

// Calculator using switch
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//         ==  checks if there is one object and references are point to that one/same object
//        equals checks that object enclosed is same as representation  of char in both is same and object can be different

        switch (fruit) {
            case "Mango" -> System.out.println("Yellow");
            case "Apple" -> System.out.println("Red");
            case "Kiwi" -> System.out.println("Green");
            case "Pomegranate" -> System.out.println("Wine Red");
            default -> System.out.println("Colored ^^");
        }

//        switch (fruit){
//            case "Mango":
//                System.out.println("Yellow");
//                break;
//            case "Apple":
//                System.out.println("Red");
//                break;
//            case "Pomegranate":
//                System.out.println("Wine Red");
//                break;
//            case "Kiwi":
//                System.out.println("Green");
//                break;
//            default:
//                System.out.println("Colorful^^");
//        }
    }
}
