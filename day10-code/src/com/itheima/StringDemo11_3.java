package com.itheima;

import java.util.Scanner;

//链式编程:
//当我们在调用一个方法的时候，不需要用变量接受它的结果，可以继续调用的方法
public class StringDemo11_3 {
    public static void main(String[] args) {
        int len=getString().substring(1).replace("b","hh").length();
        //abc -> bc -> hhc -> 计算长度--3
        System.out.println(len);//3

        //所以可以这样实现StringBuilder添加的直观性
        StringBuilder sb=new StringBuilder();
        sb=sb.append("你").append("好").append("世").append("界");
        int lenth=sb.toString().length();
        System.out.println(lenth);//4
    }


    public static String getString(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        return str;
    }
}
