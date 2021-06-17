package com.readyhuihui.designpatterndemo.structural.proxy.stademo2;

/**
 * @description
 * @author liyonghui@cdvcloud.com
 * @date 2021/4/14 15:58 
 **/
public class Test {
    public static void main(String[] args) {
        Star star = new StarImpl();
        Star proxy = new ProxyStar(star);
        proxy.sing();
    }
}
