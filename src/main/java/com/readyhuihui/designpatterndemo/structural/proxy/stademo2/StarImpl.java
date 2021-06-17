package com.readyhuihui.designpatterndemo.structural.proxy.stademo2;

/**
 * @description
 * @author liyonghui@cdvcloud.com
 * @date 2021/4/14 15:56 
 **/
public class StarImpl implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦).sing() ");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
