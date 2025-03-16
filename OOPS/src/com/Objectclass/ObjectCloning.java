package com.Objectclass;

import java.util.Arrays;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Abe = new Human(24,"Abe");
        Human Abi = new Human(Abe);

        //insted we use clonable interface and clone
        Human twin = (Human)Abe.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(Abe.arr));

        twin.age = 25;
        System.out.println(twin.age + " " + Abe.age);
    }
}
class Human implements Cloneable {
    int age;
    String name;
    //if we add array
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,3,5,6,7};
    }
    public Human(Human h){
        this.age = h.age;
        this.name = h.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}