package com.readyhuihui.designpatterndemo.factory.fruit;

public class Grape implements Fruit
{
    public void grow()
    {
        System.out.println("Grape.grow()");
    }

    public void harveset()
    {
        System.out.println("Grape.harveset()");
    }

    public void plant()
    {
        System.out.println("Grape.plant()");
    }
}