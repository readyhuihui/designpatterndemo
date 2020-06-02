package com.readyhuihui.designpatterndemo.singleton.doublecheck;

/**
 * @Author:lyh
 * @Description:6,双检锁
 * @Date:Created in 2020/5/30 0:18
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    public Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }

        }

        return instance;
    }
}
