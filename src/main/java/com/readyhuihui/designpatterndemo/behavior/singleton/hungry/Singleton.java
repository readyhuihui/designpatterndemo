package com.readyhuihui.designpatterndemo.behavior.singleton.hungry;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author:lyh
 * @Description:1.饿汉模式
 * @Date:Created in 2020/5/29 23:50
 */
public class Singleton {

    //在类内部实例化一个实例
    private static Singleton singleton = new Singleton();

    //提供私有构造函数，屏蔽外界访问
    private Singleton() {

        if(null !=singleton){
            throw new RuntimeException("单例被侵犯！");
        }
    }

    //对外提供获取实例的静态方法
    public static Singleton getInstance() {

        return singleton;
    }


    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        Singleton singleton1 = getInstance();
        Singleton singleton2 = getInstance();
        System.out.println(singleton1 == singleton2);

        //问题：以反射方式调用私有构造方法创建出来的非单例 https://www.javaer101.com/en/article/4936217.html
//        Constructor constructor= Singleton.class.getDeclaredConstructors()[0];
//        constructor.setAccessible(true);
//        Singleton singleton1 = (Singleton) constructor.newInstance();
//        Singleton singleton2 = (Singleton) constructor.newInstance();
//        System.out.println(singleton1 ==singleton2);
        //解决办法：在构造方法内加个非空判断，抛除异常。



    }

//    汇总：
//    就是一个简单的单例的实现，这种实现方式我们称之为饿汉式。所谓饿汉。这是个比较形象的比喻。对于一个饿汉来说，他希望他想要用到这个实例的时候就能够立即拿到，而不需要任何等待时间。所以，通过static的静态初始化方式，在该类第一次被加载的时候，就有一个SimpleSingleton的实例被创建出来了。这样就保证在第一次想要使用该对象时，他已经被初始化好了。
//    同时，由于该实例在类被加载的时候就创建出来了，所以也避免了线程安全问题。（原因见：在深度分析Java的ClassLoader机制（源码级别）、Java类的加载、链接和初始化）
}
