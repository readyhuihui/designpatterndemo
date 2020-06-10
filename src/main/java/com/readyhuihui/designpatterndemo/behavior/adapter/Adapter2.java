package com.readyhuihui.designpatterndemo.behavior.adapter;

/*
 * 适配器(对象适配器方式，使用了组合的方式跟被适配对象整合)
 * 相当于usb和ps/2的转接器
 * */
public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}