package com.yb.solid.OpenClosed;

public class Dog implements Noise{

    @Override
    public void makeNoise() {
        System.out.println("Haw haw");
    }
}
