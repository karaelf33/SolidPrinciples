package com.yb.solid.OpenClosed;

public class Bird  implements Noise {
    @Override
    public void makeNoise() {
        System.out.println("Cik cik");
    }
}
