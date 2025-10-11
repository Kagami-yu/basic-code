package com.itheima.test;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    //赋值不用返回结果
    public void setName(String name) {
        //局部变量表示测试类中调用的方法传递过来的数据
        //等号的左边：就表示成员位置的name,右边遵循就近原则
        this.name = name;
    }

    public String getName() {
        //return name和return this.name都可以
        return name;
    }


    public void setAge(int age) {
        if (age >= 18 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void play() {
        System.out.println("女朋友在玩手机");
    }
}
