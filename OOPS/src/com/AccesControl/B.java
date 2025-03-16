package com.AccesControl;

public class B extends A{
    int n;

    B(int num ,String name) {
        super(num,name);
        this.n =  -1;
    }
    B(double sal){
        super(sal);
    }

    public static void main(String[] args) {
        A a = new B(10,"A");
        double price = a.price;
    }
}
