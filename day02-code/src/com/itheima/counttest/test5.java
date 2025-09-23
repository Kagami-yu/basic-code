package com.itheima.counttest;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名次");
        int a = sc.nextInt();
        //不能写a=1，这是赋值
        if (a == 1) {
            System.out.println("小红与小明成为对象");
        } else {
            System.out.println("我们没戏");
        }
    }
}
