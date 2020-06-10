package com.readyhuihui.designpatterndemo.behavior.singleton.hungry;

/**
 * @Author:lyh
 * @Description:2.饿汉模式变种
 * @Date:Created in 2020/5/30 0:02
 */
public class Singleton2 {
    //在类内部定义
    private static Singleton2 instance;

    static {
        //实例化该实例
        instance = new Singleton2();

    }

    //私有的构造函数,外部无法访问
    private Singleton2() {

    }

    //对外提供获取实例的静态方法
    public static Singleton2 getInstance() {
        return instance;
    }
//    饿汉式单例，在类被加载的时候对象就会实例化。这也许会造成不必要的消耗，因为有可能这个实例根本就不会被用到。而且，如果这个类被多次加载的话也会造成多次实例化。
// 其实解决这个问题的方式有很多，下面提供两种解决方式，第一种是使用静态内部类的形式。第二种是使用懒汉式。
}

