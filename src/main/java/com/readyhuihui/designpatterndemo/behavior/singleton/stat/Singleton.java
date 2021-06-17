package com.readyhuihui.designpatterndemo.behavior.singleton.stat;

/**
 * @Author:lyh
 * @Description:4,静态内部类
 * @Date:Created in 2020/5/30 0:05
 */
public class Singleton {


    /**
     * 在静态内部类中初始化实例对象
     */
    private static class getInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {

    }

    /**
     * 对外提供获取实例的静态方法
     * @return
     */
    public static final Singleton getInstance() {
        return getInstance.INSTANCE;
    }


}
