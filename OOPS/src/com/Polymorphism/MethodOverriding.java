package com.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Car car = new Car();
        car.show();

        Maruthi car1 = new Maruthi();
        car1.show();

        Ford car2 = new Ford();
        car2.show();

        BMW car3 = new BMW();
        car3.show();
    }
}

//Method Overriding - Everthing is exactly same as parent method only the body change(sout)
class Car{
    void show(){
        System.out.println("This is a car");
    }
}
class Maruthi extends Car{
    @Override //anotation - to check whether a method is being overridden or not
    void show(){
        System.out.println("This is a maruthi");
    }
}
class BMW extends Car{
    @Override
    void show(){
        System.out.println("This is a bmw");
    }
}
class Ford extends Car{
    @Override
    void show(){
        System.out.println("This is a ford");
    }
}