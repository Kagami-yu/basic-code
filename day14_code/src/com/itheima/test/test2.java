package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        String str = sc.nextLine();
        int num = 0;
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[0] == '0') {
                System.out.println("数据不规范");
                return;
            }
            if (count == 10) {
                System.out.println("数据长度超出");
                return;
            } else {
                num = num * 10 + (charArray[i] - 48);
                count++;
            }

        }
        System.out.println(num);
    }
}
