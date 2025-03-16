package com.inheritance;

public class Boxprice extends BoxWeight {
    double price;


    Boxprice() {
        super();
        this.price = -1;
    }

    Boxprice(double side, double w,double price) {
        super(side,w);
        this.price = price;
    }

    public Boxprice(double length,double width,double height,double weight,double price) {
        super(length,width,height,weight);
        this.price = price;
    }
}
