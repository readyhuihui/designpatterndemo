package com.readyhuihui.designpatterndemo.singleton.enum2;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/5/30 0:22
 */
public enum Singleton {
    INSTANCE;

    public Singleton getInstance() {
        return INSTANCE;
    }
}
