package com.oops;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void greeting(){
//        System.out.println(this.name);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
//        this.population += 1;  // As this is not specific to object
    }
}
