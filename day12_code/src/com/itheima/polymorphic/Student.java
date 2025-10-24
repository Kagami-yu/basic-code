package com.itheima.polymorphic;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生的信息为:"+getName()+","+getId());
    }
}
