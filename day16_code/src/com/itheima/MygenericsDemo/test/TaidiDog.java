package com.itheima.MygenericsDemo.test;

public class TaidiDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的泰迪正在边吃边蹭");
    }
}
