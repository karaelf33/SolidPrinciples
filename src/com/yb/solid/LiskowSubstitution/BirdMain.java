package com.yb.solid.LiskowSubstitution;

public class BirdMain {

    public static void callFlyOperation(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {

        Duck duck=new Duck();
        Owl owl=new Owl();
        Penguin penguin=new Penguin();
        callFlyOperation(duck);
        callFlyOperation(owl);
        callFlyOperation(penguin);


    }
}
