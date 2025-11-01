package com.itheima.objectDemo;

public class demo2 {
    public static void main(String[] args) {
        Student s1=new Student("张三",18);
        Student s2=new Student("张三",18);
        boolean b=s1.equals(s2);//重写前:false地址值不同/重写后:true
        System.out.println(b);//s1调用equals方法，而student中没有重写equals方法，所以调用object的equals
        //而object里的equals默认比较地址值
//        s2=s1;
//        boolean b1=s2.equals(s1);//true在同一个堆内存，地址相同
//        System.out.println(b1);

        String s="abc";
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(s.equals(sb));//false--s调用的equals，String里的equals方法先判断参数是不是字符串
        //如果是再内部比较,如果不是字符串直接返回false
        System.out.println(s.equals(sb));//false--sb调用的equals方法，而StringBuilder里没有重写equals方法
        //用的是object里的equals方法，默认用==比较地址值
    }

}
