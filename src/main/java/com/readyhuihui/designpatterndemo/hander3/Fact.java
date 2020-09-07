package com.readyhuihui.designpatterndemo.hander3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/9/7 20:39
 */
public class Fact {
    public static Map<String, Handler> map = new HashMap<>();


    public static Handler getHand(String name) {
        return map.get(name);
    }

    public static  void regist(String name, Handler hd) {
        map.put(name, hd);
    }
}
