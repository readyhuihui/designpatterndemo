package com.readyhuihui.designpatterndemo.builder;

public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuider buider;

    public SxtAirShipDirector(AirShipBuider buider) {
        this.buider = buider;
    }

    @Override
    public AirShip directorAirShip() {

        Engine e = buider.buiderEngine();
        OrbitalModule o = buider.buiderOrbitalModule();
        EscapeTower et = buider.buiderEscapeTower();
        //装配成飞船
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }
}