package com.readyhuihui.designpatterndemo.behavior.factory.operate;

//加法
public class OperationAdd extends Operation {

    @Override
    protected double getResule() {
        return getValue1() + getValue2();
    }
}