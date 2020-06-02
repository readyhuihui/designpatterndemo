package com.readyhuihui.designpatterndemo.singleton.lazy;

/**
 * @Author:lyh
 * @Description:5,线程安全的懒汉模式
 * @Date:Created in 2020/5/30 0:09
 */
public class SingletonSafe {

    private static SingletonSafe instance;

    private SingletonSafe() {

    }

    public static SingletonSafe getInstance() {
        if (null == instance) {
            instance = new SingletonSafe();
        }

        return instance;
    }

}
