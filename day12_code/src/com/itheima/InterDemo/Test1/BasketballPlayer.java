package com.itheima.InterDemo.Test1;

public class BasketballPlayer extends Coach{
    public BasketballPlayer() {}
    public BasketballPlayer(String name,int age) {
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println(getAge()+"岁的"+getName()+"正在学打篮球");
    }
}
