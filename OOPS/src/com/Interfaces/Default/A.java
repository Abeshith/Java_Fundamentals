package com.Interfaces.Default;

public interface A {
    void greet();

    //static methods in interface should have a body

    //cant have some like this
    //static void fun();


    static void hello(){
        System.out.println("hello");
    }

    default void fun() {
        System.out.println("This is fun");
    }
}
