package com.itheima.polymorphic.Test4;

public class Dog extends Animal {
    public Dog(){}
    public Dog(int age, String color){
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"色的狗死死抱着"+something+"猛吃");
    }
    public void lookhome(){
        System.out.println("狗在看家");
    }
}
