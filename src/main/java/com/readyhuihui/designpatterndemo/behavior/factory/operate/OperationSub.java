package com.readyhuihui.designpatterndemo.behavior.factory.operate;

//减法
public class OperationSub extends Operation {

    @Override
    protected double getResule() {
        return getValue1() - getValue2();
    }
}