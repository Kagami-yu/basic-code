package com.itheima.test;
//卖飞机票

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("头等舱0还是经济舱1");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            price=getPrice(price,seat,0.9,0.85);
            System.out.println(price);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            price=getPrice(price,seat,0.7,0.65);
            System.out.println(price);
        } else {
            System.out.println("无效数据");
        }
    }
    public static int getPrice(int price,int seat,double num1,double num2){
        if (seat == 0) {
            price =(int) (price * num1);
        } else if (seat == 1) {
            price =(int) (price * num2);
        } else {
            System.out.println("无效数据");
        }
        return price;
    }
}
