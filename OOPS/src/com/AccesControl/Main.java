package com.AccesControl;

public class Main {
    public static void main(String[] args) {
        A a = new A(24,"idfc");
        //a.num() - error bcz of private num
        String n = a.name; // default allows in same package but in differnt package it will not allow

        //public allows everywhere
        double sal = a.price; // protected data member
    }
 }
