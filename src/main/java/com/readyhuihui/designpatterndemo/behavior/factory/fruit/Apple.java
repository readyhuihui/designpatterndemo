package com.readyhuihui.designpatterndemo.behavior.factory.fruit;

public class Apple implements Fruit {
    public void grow() {
        System.out.println("Apple.grow()");
    }

    public void harveset() {
        System.out.println("Apple.harveset()");
    }

    public void plant() {
        System.out.println("Apple.plant()");
    }
}