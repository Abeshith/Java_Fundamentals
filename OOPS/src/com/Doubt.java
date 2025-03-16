package com;

public class Doubt {
    public static void main(String[] args) {
        Human u = new Human("Abe",23);
        String name = u.name;
        System.out.println(u.compare(23));
    }
}
class Human{
    String name;
    int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    boolean compare(int age){
        return age == this.age;
    }
}
