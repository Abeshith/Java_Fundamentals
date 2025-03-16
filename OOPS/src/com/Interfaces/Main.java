package com.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car cars = new Car();
        Engine car = new Car(); // we can also do this

        int val = Engine.VALUE; //or car.VALUE or Car(class name).VALUE
        int n = cars.VALUE; // can also access this car class

        car.accelerate();
        car.start();
        car.stop();

        int a = cars.a;
        //int a = car.a; //error bcz Engine refrence type

        Media media = new Car();

        media.start(); // it will the engines method
        media.stop();
        media.pause();

    }
}
