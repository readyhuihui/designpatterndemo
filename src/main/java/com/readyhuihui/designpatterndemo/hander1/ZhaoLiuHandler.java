package com.readyhuihui.designpatterndemo.hander1;

import org.springframework.stereotype.Component;

@Component
public class ZhaoLiuHandler implements Handler {

    @Override
    public void AAA(String name) {
        // 业务逻辑A
        System.out.println("赵六完成任务");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register("赵六", this);
    }
}