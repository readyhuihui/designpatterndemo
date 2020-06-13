package com.readyhuihui.designpatterndemo.behavior.factoryethod2;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}