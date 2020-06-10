package com.readyhuihui.designpatterndemo.behavior.adapter;

/*
 * 适配器(类适配方式)
 * 相当于usb和ps/2的转接器
 * */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleRequest() {
        super.request();
    }
}