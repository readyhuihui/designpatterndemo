package com.readyhuihui.designpatterndemo.structural.proxy.dynamic;

public interface UserService {
    public void select();   
    public void update();
}

 class UserServiceImpl implements UserService {
    public void select() {  
        System.out.println("查询 selectById");
    }
    public void update() {
        System.out.println("更新 update");
    }
}
