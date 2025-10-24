package com.itheima.polymorphic.Test4;


import com.itheima.extend.demo1.dog;

public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getAge()+"岁的"+dog.getColor()+"的狗");
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+ cat.getAge()+"岁的"+cat.getColor()+"的猫");
//        cat.eat(something);
//    }
    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog){
//            Dog d=(Dog)animal;
//            d.lookhome();
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+ animal.getAge()+"岁的"+animal.getColor()+"的狗");
        }else if(animal instanceof Cat){
//            Cat c=(Cat)animal;
//            c.catchmouse();
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+ animal.getAge()+"岁的"+animal.getColor()+"的猫");
        }
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+ animal.getAge()+"岁的"+animal.getColor()+"的动物");
        animal.eat(something);
    }
}
