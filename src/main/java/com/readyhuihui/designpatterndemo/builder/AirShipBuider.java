package com.readyhuihui.designpatterndemo.builder;

public interface AirShipBuider {

    Engine buiderEngine();

    OrbitalModule buiderOrbitalModule();

    EscapeTower buiderEscapeTower();
}