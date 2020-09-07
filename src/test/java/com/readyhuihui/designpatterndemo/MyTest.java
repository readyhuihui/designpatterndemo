package com.readyhuihui.designpatterndemo;

import com.readyhuihui.designpatterndemo.hander3.Fact;
import com.readyhuihui.designpatterndemo.hander3.Handler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/9/7 20:42
 */
@SpringBootTest
public class MyTest {

    @Test
    public void test(){
        String name ="张三";
        Handler handler = Fact.getHand(name);
        handler.AAA("张三");
//        handler.BBB("张三");
    }
}
