package com.readyhuihui.designpatterndemo.behavior.singleton.doublecheck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author:lyh
 * @Description:6,双检锁
 * @Date:Created in 2020/5/30 0:18
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        if (null != instance) {
            throw new RuntimeException("单例被侵犯！");
        }
    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }

        }

        return instance;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

//        Singleton singleton1 = getInstance();
//        Singleton singleton2 = getInstance();
//        System.out.println(singleton1 == singleton2);

//参考：有特权的客户端能够使用反射中的AccessibleObject.setAccessible访问私有的构造器。为了防御这种攻击，把构造器修改为在第二次实例化的时候抛出异常
// https://www.cnblogs.com/cxuanBlog/p/11161524.html
        Constructor constructor = Singleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();
        Singleton singleton2 = (Singleton) constructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }
}
