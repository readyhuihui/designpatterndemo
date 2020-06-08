package com.readyhuihui.designpatterndemo.factoryethod2;

public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}