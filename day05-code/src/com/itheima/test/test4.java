package com.itheima.test;

//猜数字

import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Random rand = new Random();
        //生成1-100的随机数字
        int a = rand.nextInt(100) + 1;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        //   System.out.println("请输入一个1-100的整数");
        //   int b = sc.nextInt();这个要写在循环内才能确保猜错可以再输入
        while (true) {
            System.out.println("请输入一个1-100的整数");
            int b = sc.nextInt();
            if (b > a) {
                System.out.println("大了");
            } else if (b < a) {
                System.out.println("小了");
            } else {
                System.out.println("正确");
                break;
            }
        }
    }
}
