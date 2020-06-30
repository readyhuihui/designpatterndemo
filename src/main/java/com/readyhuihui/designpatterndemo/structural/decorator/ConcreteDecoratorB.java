package com.readyhuihui.designpatterndemo.structural.decorator;

/**
 * @Author:lyh
 * @Description:具体装饰角色
 * @Date:Created in 2020/7/1 0:55
 */
public class ConcreteDecoratorB extends  Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
//        super.sampleOperation();
        System.out.println("B的实现");
    }
}
