package com.itheima.AbstractTest;

public class Goat extends Animal {
    public Goat(){}
    public Goat(String name,int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }
}
