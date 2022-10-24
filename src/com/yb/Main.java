package com.yb;

import com.yb.solid.Bird;
import com.yb.solid.OpenClosed.Cat;
import com.yb.solid.OpenClosed.Dog;
import com.yb.solid.OpenClosed.Noise;

import java.util.List;

public class Main {

    static void makeNoise(List<Noise> noises) {
        for (Noise noise : noises) {
            noise.makeNoise();


        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird=new Bird();
        List<Noise> noises = List.of(cat, dog,bird);
        makeNoise(noises);
    }
}
