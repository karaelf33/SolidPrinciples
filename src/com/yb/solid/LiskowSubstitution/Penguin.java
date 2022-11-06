package com.yb.solid.LiskowSubstitution;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("I am a Penguin and I can not fly");
    }
}
