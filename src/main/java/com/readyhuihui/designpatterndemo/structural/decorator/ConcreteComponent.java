package com.readyhuihui.designpatterndemo.structural.decorator;

/**
 * @Author:lyh
 * @Description:具体构建角色
 * @Date:Created in 2020/7/1 0:51
 */
public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {

        System.out.println("输出实现");
    }
}
