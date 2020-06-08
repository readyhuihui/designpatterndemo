package com.readyhuihui.designpatterndemo.builder;

public class SxtAirShipBuider implements AirShipBuider {

    @Override
    public Engine buiderEngine() {
        System.out.println("构建发动机");
        return new Engine("尚学堂牌发动机");
    }

    @Override
    public OrbitalModule buiderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("尚学堂牌轨道舱");
    }

    @Override
    public EscapeTower buiderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("尚学堂牌逃逸塔");
    }
}