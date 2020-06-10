package com.readyhuihui.designpatterndemo.behavior.builder;

public interface AirShipBuider {

    Engine buiderEngine();

    OrbitalModule buiderOrbitalModule();

    EscapeTower buiderEscapeTower();
}