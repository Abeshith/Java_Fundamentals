package com.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println(num.sum(8.0,9.9));

        System.out.println(num.sum(7,3,2));
    }
}
class Numbers{
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    int sum(double a, double b) {
        double sum = a + b;
        return (int) sum;
    }
}
