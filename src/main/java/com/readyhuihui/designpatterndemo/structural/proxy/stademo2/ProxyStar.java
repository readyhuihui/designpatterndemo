package com.readyhuihui.designpatterndemo.structural.proxy.stademo2;

/**
 * @description
 * @author liyonghui@cdvcloud.com
 * @date 2021/4/14 15:56 
 **/
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");

    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");

    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");

    }

    @Override
    public void sing() {
        star.sing();

    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");

    }
}
