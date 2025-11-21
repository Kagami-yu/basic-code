package com.itheima.MygenericsDemo.test;

public class HuskyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的哈士奇正在边吃边拆家");
    }
}
