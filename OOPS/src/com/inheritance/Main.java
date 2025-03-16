package com.inheritance;

import com.AccesControl.A;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.length + " " + box.width + " " + box.height);

        System.out.println();
        //one parametered constructor
        System.out.println("one parametered constructor");
        Box box2 = new Box(4);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        System.out.println();
        //Three Parameterized constructor
        System.out.println("three parametered constructor");
        Box box3 = new Box(4,7,9);
        System.out.println(box3.length + " " + box3.width + " " + box3.height);

        System.out.println();
        //Copy Constructor
        System.out.println("Copy constructor");
        Box box4 = new Box(box2);
        System.out.println(box4.length + " " + box4.width + " " + box4.height);

        /**********************************************************************/
        System.out.println();
        System.out.println("Inherited class constructor");
        BoxWeight box5 = new BoxWeight(43,56,123,57);
        System.out.println(box5.length + " " + box5.width + " " + box5.height + " " + box5.weight);

        System.out.println();
        // Box reference id refenrencing the Boxweight class (child) but can't access the methods or constructors
        System.out.println("Parent and child class reference");
        Box box6 = new BoxWeight(8,4,3,9);
        System.out.println(box6.length + " " + box6.width + " " + box6.height);
        //only able to reference cant access
        //System.out.println(box6.weight);

        System.out.println();
        //calling parent class copy constructor
        System.out.println("Parent class copy constructor and child class weight reference");
        BoxWeight box7 = new BoxWeight(box2,9);
        System.out.println(box7.length + " " + box7.width + " " + box7.height + " " + box7.weight);

        System.out.println();
        System.out.println("child class copy constructor");
        BoxWeight box8 = new BoxWeight(box5);
        System.out.println(box8.length + " " + box8.width + " " + box8.height + " " + box8.weight);


        /**********************************************************************************************************/
        System.out.println();
        // Multilevel Constructor
        Boxprice price1 = new Boxprice(1,2,3,4,5);
        System.out.println(price1.length + " " + price1.width + " " + price1.height + " " + price1.weight + " " + price1.price);

        Boxprice price2 = new Boxprice();
        System.out.println(price2.length + " " + price2.width + " " + price2.height + " " + price2.weight + " " + price2.price);

        Boxprice price3 = new Boxprice(8,9,200);
        System.out.println(price3.length + " " + price3.width + " " + price3.height + " " + price3.weight + " " + price3.price);



        //encapsulation protected
        A a = new A(34);
       // double s = a.price;  //cant access bcz not a subclass
    }
}
