package com.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music is playing!");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopping!");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused!");
    }
}
