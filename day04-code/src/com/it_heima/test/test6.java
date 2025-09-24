package com.it_heima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = sc.nextInt();
        int b = n;
        int count = 0;
        for (; n != 0; n = n / 10) {
            //上文有定义变量可在第一个分号前留空
            int ge = n % 10;
            count = count * 10 + ge;
        }
        if (count == b) {
            System.out.println("该数字为回文数");
        } else {
            System.out.println("该数字表示回文数");
        }
    }
}
