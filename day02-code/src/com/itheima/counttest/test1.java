package com.itheima.counttest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，分别获取各位数

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数");
        int num = sc.nextInt();
        int ge=num %10;
        int shi=num /10%10;
        int bai =num /100%10;
        System.out.println("个位"+ge);
        System.out.println("十位"+shi);
        System.out.println("百位"+bai);
    }
}
