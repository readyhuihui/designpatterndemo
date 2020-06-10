package com.readyhuihui.designpatterndemo.behavior.singleton.lazy;

/**
 * @Author:lyh
 * @Description:3.懒汉模式
 * @Date:Created in 2020/5/29 23:50
 */
public class Singleton {

    //在类内部定义
    private static Singleton singleton = null;

    //提供私有构造函数，外部无法访问
    private Singleton() {

    }

    public static Singleton getInstance() {
        //在对象被使用的时候才实例化
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }


    public static void main(String[] args) {

        Singleton singleton1 = getInstance();
        Singleton singleton2 = getInstance();
        System.out.println(singleton1 == singleton2);
    }

//    上面这种单例叫做懒汉式单例。懒汉，就是不会提前把实例创建出来，将类对自己的实例化延迟到第一次被引用的时候。getInstance方法的作用是希望该对象在第一次被使用的时候被new出来。
//
//    有没有发现，其实code 5这种懒汉式单例其实还存在一个问题，那就是线程安全问题。在多线程情况下，有可能两个线程同时进入if语句中，这样，在两个线程都从if中退出的时候就创建了两个不一样的对象。（这里就不详细讲解了，不理解的请恶补多线程知识）。
}
