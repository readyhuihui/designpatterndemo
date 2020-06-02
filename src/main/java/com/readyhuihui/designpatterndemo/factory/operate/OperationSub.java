package com.readyhuihui.designpatterndemo.factory.operate;

//减法
public class OperationSub extends Operation {

    @Override
    protected double getResule() {
        return getValue1() - getValue2();
    }
}