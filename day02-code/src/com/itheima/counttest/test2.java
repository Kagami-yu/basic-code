package com.itheima.counttest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入自己衣服的时髦程度");
        int myfashion=sc.nextInt();
        System.out.println("请输入对象衣服的时髦程度");
        int girlfashion=sc.nextInt();
        boolean res= myfashion>girlfashion;
        System.out.println("相亲结果"+res);
    }
}
