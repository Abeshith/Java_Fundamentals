package com.Polymorphism;

public class FinalClass {
    public static void main(String[] args) {
        Fruits fr = new Fruits();
        fr.color();

        Fruits fr2 = new Fruits();
        fr2.size(27);

        fr2.size(30);

    }
}

final class Fruits{
    void color() {
        System.out.println("Fruits color");
    }
    final void size(int size){    //used when subclass does want to access this method
        System.out.println( size + "size");
    }

}

class Apples /*extends Fruits will not work because final method */{
    void color() {
        System.out.println("Apples color");
    }
}
