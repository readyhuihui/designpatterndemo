package com.readyhuihui.designpatterndemo.structural.proxy.stademo;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/6/13 0:18
 */
public class RealSubject extends Subjects {

    @Override
    public void sayHi() {
        System.out.println("do something...");
    }
}
