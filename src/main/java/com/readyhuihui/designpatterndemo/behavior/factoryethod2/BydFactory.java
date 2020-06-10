package com.readyhuihui.designpatterndemo.behavior.factoryethod2;

public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}