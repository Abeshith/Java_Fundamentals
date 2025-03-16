package com.BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //BD();

        BigDecimal x = new BigDecimal("0.03");
        BigDecimal y = new BigDecimal("0.04");

        System.out.println(x + " " + y);
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.pow(2));
        System.out.println(x.negate());
    }
    static void BD(){
        double x = 0.03;
        double y = 0.05;
        double ans = y - x;
        System.out.println(ans);
    }
}
