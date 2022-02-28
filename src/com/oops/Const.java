package com.oops;

import java.lang.reflect.Constructor;

public class Const {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student(1, "ana", "Science");
        Student st3 = new Student(st1);
        st.printObj();
        st1.printObj();
        st3.printObj();

        Integer num = 32;
        num = 43;

    }
}

class Student{
    int rollno;
    String name;
    String dept;

    void greeting(){
        System.out.println("Hey, I'm" + this.name);
    }

    Student(){
        this.rollno = -1;
        this.name = "";
        this.dept = "";
    }

    Student(int rollno, String name, String dept){
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }

    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.dept = other.dept;
    }

    void printObj(){
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.dept);
    }
}

