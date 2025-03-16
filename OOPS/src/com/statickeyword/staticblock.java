package com.statickeyword;

public class staticblock {
    static int a = 10;
    static int b;

    static {
        System.out.println("static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticblock obj = new staticblock(); // static block will run only once
        System.out.println(obj.a + " " + obj.b);

        b = b + 3;

        //after creating new object also static block wont run
        staticblock obj2 = new staticblock();
        System.out.println(obj2.a + " " + obj2.b);

    }
}
