package com.itheima.test;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    //赋值不用返回结果
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }


    public void setAge(int a) {
        if(a>=18&&a<=25){
            age = a;
        }else{
            System.out.println("非法数据");
        }
    }
    public int getAge() {
        return age;
    }

    public void setGender(char g) {
        gender = g;
    }
    public char getGender() {
        return gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void play(){
        System.out.println("女朋友在玩手机");
    }
}
