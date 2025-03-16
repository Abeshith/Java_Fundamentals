package com.Interfaces;

public class Car implements Engine,Brake,Media{
    int a  = 20;

    //can be accessed like this
    int val = Engine.VALUE;

    @Override
    public void brake() {
        System.out.println("Brake applied to the car");
    }

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerated to 90km/hr");
    }

    @Override
    public void pause(){
        System.out.println("Media is paused");
    }
}
