package com.readyhuihui.designpatterndemo.structural.decorator;

/**
 * @Author:lyh
 * @Description:装饰器
 * @Date:Created in 2020/7/1 0:52
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        //委派给构件
        component.sampleOperation();
    }
}
