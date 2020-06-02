package com.readyhuihui.designpatterndemo.factory.fruit;

public class Gardener
{
    public static Fruit getFruit(String fruitPath) throws Exception
    {
        Class<?> c = Class.forName(fruitPath);
        return (Fruit)c.newInstance();       
    }

    public static void main(String[] args) throws Exception
    {
        Fruit fruit0 = Gardener.getFruit("com.readyhuihui.designpatterndemo.factory.fruit.Apple");
        fruit0.grow();
        Fruit fruit1 = Gardener.getFruit("com.readyhuihui.designpatterndemo.factory.fruit.Grape");
        fruit1.harveset();
    }
}