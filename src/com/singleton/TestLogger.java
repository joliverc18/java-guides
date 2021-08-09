package com.singleton;

public class TestLogger {
    public static void main(String args[]) {
        /*
        * Without creating objects, you cannot call the method in the class
        * Unless you introduce the concept of static into this particular case.
        * */

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        /*
        * To prove that both obj1 and obj2 are using the singleton pattern,
        * which both object is the same instance.
        * We print the hashcode of the object, which should be the same.
        * */
        System.out.println("Obj1 hashCode: " + obj1.hashCode());
        System.out.println("Obj2 hashCode: " + obj2.hashCode());

        System.out.println("----------------------------------");

        /*
        * Here we further solidify our example with an opposite sample case.
        * A non-singleton object has been created twice.
        * Theoretically both object should have different hashcodes.
        * */

        TestLogger obj3 = new TestLogger();
        TestLogger obj4 = new TestLogger();

        System.out.println("Obj3 hashCode: " + obj3.hashCode());
        System.out.println("Obj4 hashCode: " + obj4.hashCode());

    }
}
