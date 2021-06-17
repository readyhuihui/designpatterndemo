package com.readyhuihui.designpatterndemo.structural.qiaojie;

/**
 * @description 电脑类型
 * @author liyonghui@cdvcloud.com
 * @date 2021/4/14 17:48 
 **/
public class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public String saleComp() {
        return brand.sale();
    }
}

class DeskTop2 extends Computer2 {

    public DeskTop2(Brand brand) {
        super(brand);
    }

    @Override
    public String saleComp() {
        String pinPaiStr = super.saleComp();
        return "台式机-" + pinPaiStr;
    }
}

class Laptop2 extends Computer2 {

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public String saleComp() {
        String pinPaiStr = super.saleComp();
        return "笔记本-" + pinPaiStr;
    }
}
