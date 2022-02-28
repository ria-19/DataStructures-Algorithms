package com.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " + box.h + " " + box.w);
//
//        BoxWeight box3 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box3.w + " " + box3.weight);

//        Box box5 = new BoxWeight(2, 3, 4, 8);

        // It is the type of reference variable that determines what members can be accessed.
        // Using reference variable of super class we can reference an object of Child Class but not vice versa



        //  System.out.println(box5.weight + " " + box5.w);
       // BoxWeight box6 =  new Box(2, 3, 4);

        // there are many variables in both parent and child classes
        // you can access to variables that are in the reference type i.e. BoxWeight
        // hence, you should have access to weight variable
        // that means the ones you are trying to access should be initialised
        // here weight, but parent does not have weight, and it's constructor cannot access it


        BoxPrice box = new BoxPrice();








    }

}
