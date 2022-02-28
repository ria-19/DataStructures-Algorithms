package com.oops;
//Error: Could not find or load main class com.oops.Basic2
//Caused by: java.lang.ClassNotFoundException: com.oops.Basic2

// It represents where my Class lies. Basic2 lies in package com, inside that oops package

import static com.oops.Human.greeting;

public class Basic2 {
    public static void main(String[] args) {
        // Packages
        // It is like a container for classes (folder),
        // we need them because if we want to create Classes of same name with different
        // functionalities,
        // so packages allows us to create compartments,
        // so that we can have same class name in our projects.
        // If we want to use code from one class to another, we can import it, using packages

        // How JRE knows where to look for these methods or packages ?

        // Why swap does not work with Integer?

        // What is Static keyword?
        // Such properties or methods that are not specific  to objects and does not depend on object, rather belong to the class; they are common to all the objects,
        // they are declared as static
        // Static attributes and methods can be created.

        Human ria = new Human(21, "Ria", 56000, false);
        Human nd = new Human(32, "md", 83000, false);

//        System.out.println(ria.population);
//        // This also works because while contracting new object it looks whether the object have that attribute, if not looks into the class, if have it uses it
//        System.out.println(Human.population);

//       Basic2.greeting();
// you can not have non-static methods or attributes without referencing their instance in the static context.
    }

    void greet(){
        System.out.println("hey1");
        greeting();
    }



}
