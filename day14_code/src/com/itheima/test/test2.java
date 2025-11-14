package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        String str = sc.nextLine();
        int num = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (str.matches("[1-9]\\d{0,9}")) {
                num = num * 10 + (charArray[i] - 48);
            } else {
                System.out.println("数据不规范");
                return;
            }

        }
        System.out.println(num);
    }
}
