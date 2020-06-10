package com.readyhuihui.designpatterndemo.behavior.builder;

/**
 * @Author:lyh
 * @Description:创建型模式-建造者模式-测试类
 * @Date:Created in 2020/6/9 7:28
 */
public class Test {


    public static void main(String[] args) {
        SxtAirShipDirector sxtAirShipDirector = new SxtAirShipDirector(new SxtAirShipBuider());
        AirShip airShip = sxtAirShipDirector.directorAirShip();
        System.out.println(airShip.getEngine().getName());
        System.out.println(airShip.getEscapeTower().getName());
        System.out.println(airShip.getOrbitalModule().getName());
        airShip.launch();
    }
}
