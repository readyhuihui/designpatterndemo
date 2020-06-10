package com.readyhuihui.designpatterndemo.behavior.singleton.stat;

/**
 * @Author:lyh
 * @Description:4,静态内部类
 * @Date:Created in 2020/5/30 0:05
 */
public class Singleton {


    private static class getInstance {
        private static final Singleton instance = new Singleton();
    }

    private Singleton() {

    }

    public Singleton getInstance() {
        return getInstance.instance;
    }


}
