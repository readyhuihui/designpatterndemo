package com.readyhuihui.designpatterndemo.structural.decorator;

/**
 * @Author:lyh
 * @Description:测试类，参考地址：https://www.cnblogs.com/java-my-life/archive/2012/04/20/2455726.html
 * @Date:Created in 2020/7/1 0:56
 */
public class Test {
    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        Component component1 = new ConcreteDecoratorA(component);
        Component component2 = new ConcreteDecoratorB(component);

        component1.sampleOperation();
        component2.sampleOperation();

    }

}
