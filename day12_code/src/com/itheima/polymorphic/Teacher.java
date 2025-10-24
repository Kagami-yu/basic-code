package com.itheima.polymorphic;

public class Teacher extends Person{
    @Override
    public void show(){
        System.out.println("教师的信息为:"+getName()+","+getId());
    }
}
