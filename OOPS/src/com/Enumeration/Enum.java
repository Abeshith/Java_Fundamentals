package com.Enumeration;

public class Enum {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //Enum Constants
        //By Default they are public , static and final

        //constructor
        Week(){
            System.out.println("Constructor called for day " + this);
        }
    }

    public static void main(String[] args) {
       Week week;
       week = Week.Monday;
       System.out.println(week);
       System.out.println(week.ordinal());


    }

}
