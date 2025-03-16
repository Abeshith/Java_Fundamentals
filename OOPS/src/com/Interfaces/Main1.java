package com.Interfaces;

public class Main1 {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();


        DieselEngine die = new DieselEngine();
        NiceCar car2 = new NiceCar(die);
        car2.start();

        car.startMusic();


        car.changeingine();
        car.stop();

    }
}
