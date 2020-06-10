package com.readyhuihui.designpatterndemo.behavior.factory.operate;

//乘法
public class OperationMul extends Operation {

    @Override
    protected double getResule() {
        return getValue1() * getValue2();
    }
}
