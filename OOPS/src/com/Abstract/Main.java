package com.Abstract;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        //cant create object for abstract parent class
       // Animal ani = new Animal();

        dog.sound();
        dog.name();

        cat.sound();
        cat.name();
    }
}
//final methods cant be extended or inherited
/*final */ abstract class Animal{
    abstract void sound(); //abstract method

    int age;
    final int VALUE = 3789865;

    //can have static methods
    static void display(){
        System.out.println("I am an animal");
    }

    //cant create abstract constructors
    //abstract Parent(){}

    public void Parent(int age){
        this.age = age;
    }

    //non abstract method
    void name(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }

    @Override
    void name(){
        System.out.println("I am a dog");
    }
}


class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meowwwwwwwwwww");
    }

    @Override
    void name(){
        System.out.println("I am a cat");
    }
}