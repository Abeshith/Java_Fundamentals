package com.Interfaces;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }

    public void changeingine(){
        engine = new DieselEngine();
    }

    private Media media = new CDPlayer();

    public void startMusic(){
        media.start();
    }

}
