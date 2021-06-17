package com.readyhuihui.designpatterndemo.structural.qiaojie;

/**
 * 电脑品牌维度
 */
public interface Brand {

    String sale();
}

class Lenovo implements Brand {

    @Override
    public String sale() {
        return "联想";
    }
}

class Dell implements Brand {

    @Override
    public String sale() {
        return "戴尔";
    }
}

class ShenZhou implements Brand {

    @Override
    public String sale() {
        return "神州";
    }
}