package com.Interfaces.Default;

public class C implements B,A {//or A,B
    @Override
    public void invite() {

    }
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        C c = new C();
        c.fun();

        //call static method via interface name
        A.hello();
    }

}
