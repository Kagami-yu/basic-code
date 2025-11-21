package com.itheima.MygenericsDemo.test;

public class BosiCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的波斯猫，在吃小鱼干");
    }
}
