package com.itheima.test;
//平方根

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i < x) {
            i++;
            if (i * i == x) {
                System.out.println(i + "就是" + x + "的平方根");
                break;
            } else if (i * i > x) {
                System.out.println((i - 1) + "就是" + x + "的平方根整数部分");
                break;
            }
        }
    }
}
