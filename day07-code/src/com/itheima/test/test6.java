package com.itheima.test;

import java.util.Scanner;

/*
数字加密--1983
先得到每一位数，然后每位数加上5，再对10求余，最后将所有数字反转，再得到一串新数字
 */
//添加数字同时反转
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;//要先记录原数，不然循环结束变成num=0
        for (int i = 0; num != 0; i++) {
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int j = 0; j < arr.length; j++) {
            int ge = temp % 10;
            arr[j] = (ge + 5) % 10;
            temp = temp / 10;
        }
        int number = 0;
        for (int j = 0; j < arr.length; j++) {
            number = arr[j] + number * 10;
        }
        System.out.println(number);
    }
}
