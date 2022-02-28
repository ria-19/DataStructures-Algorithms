package com.oops;

public class InnerClasses {

    // This class being not static, is dependent on outside class; hence need object
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    // This is static, is not dependent on object.
    public static void main(String[] args) {
//        Test obj = new Test("Dan");
//       This will work ;
    }
}

// Outside classes cannot be static
// Inner classes can be static
