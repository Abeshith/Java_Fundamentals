package com.AccesControl;

public class A {
    private int num;
    public String name;
    protected double price;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public A(double price){
        this.price = price;
    }

    double getPrice(){
        return price;
    }

}
