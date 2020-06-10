package com.readyhuihui.designpatterndemo.behavior.factorymethod;

/**
 * @Author:lyh
 * @Description:抽象工厂
 * @Date:Created in 2020/6/3 21:43
 */
public interface ExportFactory {

    public ExportFile factory(String strType);
}
