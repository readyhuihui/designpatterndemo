package com.readyhuihui.designpatterndemo.structural.proxy.stademo;

/**
 * @Author:lyh
 * @Description:结构型模式-静态代理
 * @Date:Created in 2020/6/13 0:21
 */
public class Test {

    //参考地址：https://blog.csdn.net/yuyinghe0612/article/details/80506223
    public static void main(String[] args) {
        Subjects subjects = new ProxySubjects();
        subjects.sayHi();
    }
}
