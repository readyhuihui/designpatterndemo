package com.readyhuihui.designpatterndemo.hander3;

import org.springframework.stereotype.Component;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/9/7 20:38
 */
@Component
public class ZhangSanHander2 extends Handler {

    @Override
    public void AAA(String name) {
        System.out.println("张三AAA");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Fact.regist("张三", this);
    }
}
