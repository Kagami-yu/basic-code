package com.itheima.test;
//卖飞机票

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextDouble();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("头等舱0还是经济舱1");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            if (seat == 0) {
                price = price * 0.9;
            } else if (seat == 1) {
                price = price * 0.85;
            } else {
                System.out.println("无效数据");
                return;
            }
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            if (seat == 0) {
                price = price * 0.7;
            } else if (seat == 1) {
                price = price * 0.65;
            } else {
                System.out.println("无效数据");
                return;
            }
        } else {
            System.out.println("无效数据");
            return;
        }
        System.out.println(price);
    }
}
