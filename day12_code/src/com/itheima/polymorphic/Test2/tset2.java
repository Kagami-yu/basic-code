package com.itheima.polymorphic.Test2;

public class tset2 {
    public static void main(String[] args) {
        //创建对象（多态方式）
        Animal a=new Dog();
        //调用成员变量:编译看左边，运行也看左边
        //javac斌阿姨的时候先看左边父类有没有这个变量，有则编译成功获取父类的变量，没有则编译失败
        System.out.println(a.name);//这是动物
        Dog d=new Dog();
        //用子类创建对象，如果子类，优先调用子类的name，如果子类没有name则调用父类的name
        System.out.println(d.name);//这是动物
        //调用成员方法；编译看左边，运行看右边
        //javac编译的时候会看左边父类中有没有这个方法，如果有编译成功调用子类的方法，子类没有则返回调用父类的方法
        //父类没有该方法则编译失败
        a.show();//Dog----show方法
    }
}

class Animal {
    String name="这是动物";
    public void show(){
        System.out.println("Animal---show方法");
    }
}
class Dog extends Animal{
//    String name="这是狗";
    @Override
    public void show(){
        System.out.println("Dog----show方法");
    }
}
