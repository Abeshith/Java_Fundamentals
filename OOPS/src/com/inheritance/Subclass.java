package com.inheritance;
import com.AccesControl.A;
public class Subclass extends A{
    Subclass(int n,String s ){
        super(n,s);
    }

    double priceles(double price){
        this.price = price;
        return price;
    }

    public static void main(String[] args) {
        Subclass s = new Subclass(5,"S");
        double m = s.price;
    }
}
