package com.itheima.MygenericsDemo.test;

public class LihuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的狸花猫在吃老鼠");
    }
}
