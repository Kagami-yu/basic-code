package com.itheima.test3;

public class Student {
    String name;
    int age;
    private String email;
    //空参
    public Student(){}
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void study(){
        System.out.println("好好学习");
    }
}
