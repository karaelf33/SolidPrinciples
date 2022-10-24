package com.yb.solid;

import com.yb.solid.OpenClosed.Noise;

public class Bird  implements Noise {
    @Override
    public void makeNoise() {
        System.out.println("Cik cik");
    }
}
