package com.readyhuihui.designpatterndemo.behavior.absfactory;

/**
 * 轮胎
 */
public interface Tyre {
    void revolve();
}

/**
 * 好轮胎
 */
class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

/**
 * 廉价轮胎
 */
class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快");
    }
}