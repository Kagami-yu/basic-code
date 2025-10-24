package com.itheima.polymorphic.Test4;

public class test4 {
    public static void main(String[] args) {
        //创建对象并调用方法
        Person p1=new Person("老李",45);
        Person p2=new Person("老于",46);
        Dog d=new Dog(2,"黄");
        Cat c=new Cat(1,"白");
        p1.keepPet(d,"骨头");
        p2.keepPet(c,"鱼");
    }
}
