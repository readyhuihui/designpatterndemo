package com.readyhuihui.designpatterndemo.behavior.absfactory;

/**
 * @Author:lyh
 * @Description:发动机接口
 * @Date:Created in 2020/6/3 22:38
 */
public interface Engine {
    void run();

    void start();
}

/**
 * 好发动机
 */
class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转得快");
    }

    @Override
    public void start() {
        System.out.println("启动快，可以自动启停");

    }
}

/**
 * 廉价发动机
 */
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转得慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");

    }
}