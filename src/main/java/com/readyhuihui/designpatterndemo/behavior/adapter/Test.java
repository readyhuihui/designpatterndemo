package com.readyhuihui.designpatterndemo.behavior.adapter;

/**
 * @Author:lyh
 * @Description：结构型模式-适配器模式
 * @Date:Created in 2020/6/10 0:24
 */
public class Test {
    public void test1(Target target) {
        target.handleRequest();
    }

    public static void main(String[] args) {
        Test c = new Test();
        Adaptee a = new Adaptee();
        Target t = new Adapter2(a);
        c.test1(t);
    }
}
