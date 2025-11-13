package com.itheima.integerdemo;


public class IntegerDemo2 {
    public static void main(String[] args) {
        //在以前包装类如何进行计算
        Integer i1=new Integer(1);
        Integer i2=new Integer(3);
        //需求:要把两个数据进行相加得到结果三
        //对象之间不是直接相加计算的--步骤1.把对象进行拆箱，变成基本数据类型 2.相加 3.重新装箱
        int res=i1.intValue()+i2.intValue();
        Integer i3=new Integer(res);
        System.out.println(i3);
        System.out.println("=================================");
    }
}
