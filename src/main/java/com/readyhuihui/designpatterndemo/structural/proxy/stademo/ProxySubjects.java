package com.readyhuihui.designpatterndemo.structural.proxy.stademo;

/**
 * @Author:lyh
 * @Description:代理类
 * @Date:Created in 2020/6/13 0:20
 */
public class ProxySubjects extends  Subjects {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void sayHi() {
        System.out.println("before");
        realSubject.sayHi();
        System.out.println("after");
    }
}
