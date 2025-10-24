package com.itheima.polymorphic.Test4;

public class Cat extends Animal {
    public Cat(){}
    public Cat(int age, String color){
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的猫眯眼侧头吃"+something);
    }
    public void catchmouse(){
        System.out.println("猫在抓老鼠");
    }
}
