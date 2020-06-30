package com.readyhuihui.designpatterndemo.structural.decorator;

/**
 * @Author:lyh
 * @Description:具体装饰角色
 * @Date:Created in 2020/7/1 0:54
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
//        super.sampleOperation();
        System.out.println("A的实现");
    }
}
