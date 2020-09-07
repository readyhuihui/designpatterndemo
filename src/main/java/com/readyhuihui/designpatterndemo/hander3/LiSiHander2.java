package com.readyhuihui.designpatterndemo.hander3;

import org.springframework.stereotype.Component;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/9/7 20:38
 */
@Component
public class LiSiHander2 extends Handler {

    @Override
    public String BBB(String name) {
        System.out.println("李四BBB");
        return "李四";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Fact.regist("李四", this);
    }
}
