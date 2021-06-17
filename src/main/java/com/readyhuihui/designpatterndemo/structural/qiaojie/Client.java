package com.readyhuihui.designpatterndemo.structural.qiaojie;

public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑
        //通过组合实现继承关系
        Computer2 c = new Laptop2(new Lenovo());
        String str = c.saleComp();
        System.out.println(str);

        //销售神舟台式机
        Computer2 c2 = new DeskTop2(new ShenZhou());
        str = c2.saleComp();
        System.out.println(str);
    }
}