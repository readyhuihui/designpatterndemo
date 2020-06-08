package com.readyhuihui.designpatterndemo.absfactory;


/**
 * @Author:lyh
 * @Description:创建型模式-抽象工厂模式-测试类
 * @Date:Created in 2020/6/3 22:45
 */
public class Test {
    public static void main(String[] args) {
        CarFactroy carFactroy = new LuxuryFactory();
       Engine engine= carFactroy.getEngine();
       Seat seat= carFactroy.getSeat();
       Tyre tyre = carFactroy.getTyre();
       engine.run();
       engine.start();
       seat.massage();
       tyre.revolve();
        System.out.println("-------------");
       CarFactroy carFactroy1 =new LowCarFactory();
       Engine engine1 = carFactroy1.getEngine();
       engine1.run();
       engine1.start();
    }
}
