package com.readyhuihui.designpatterndemo.hander3;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/9/7 20:36
 */
public abstract class Handler implements InitializingBean {

    public void AAA(String name) {

        throw new UnsupportedOperationException();
    }

    public String BBB(String name) {
        throw new UnsupportedOperationException();
    }
}
