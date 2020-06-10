package com.readyhuihui.designpatterndemo.behavior.absfactory;

/**
 * 沙发
 */
public interface Seat {
    void massage();
}

/**
 * 奢侈品沙发
 */
class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩");
    }
}

/**
 * 廉价沙发
 */
class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩");
    }
}