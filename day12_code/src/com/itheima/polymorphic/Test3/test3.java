package com.itheima.polymorphic.Test3;

public class test3 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.eat();
        //多态的弊端，无法调用子类的特有属性，要进行强转
//        Dog d=(Dog)a;//强转为子类中的Dog
//        d.lookhome();
        //不知道谁创建的对象，if进行判断
        if(a instanceof Dog){
            ((Dog) a).lookhome();
        }else if(a instanceof Cat){
            ((Cat)a).sleep();
        }else{
            System.out.println("未找到该类型");
        }
        //新特性jdk14以上
        /*
        先判断a是否为Dog类型，如果是则强转为Dog，转还能之后变量名为d
        如果不是则不强转，结果是false
        if(a instanceof Dog d){
            d.lookhome;
        }else if(a instanceof Cat c){
            c.sleep
        }else{
         System.out.println("未找到该类型");
        }
         */
    }
}

class Animal {
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void lookhome(){
        System.out.println("狗在看家");
    }
}
class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("猫在睡觉");
    }
}

