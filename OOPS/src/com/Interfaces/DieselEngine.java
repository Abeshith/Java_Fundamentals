package com.Interfaces;

public class DieselEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Diesel Engine accelerated");
    }
}
