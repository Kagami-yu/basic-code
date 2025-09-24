package com.it_heima.test;

import java.util.Scanner;

/*
录入两个数字表示范围，在该范围中
既可以被3整除，又能被5整除的数字有多少个
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入第一个数字");
        int a = sc.nextInt();
        System.out.println("录入第二个数字");
        int b = sc.nextInt();
        int c = a > b ? a : b;//谁大取谁
        int d = a < b ? a : b;//谁小取谁
        int count = 0;
        for (int i = d; i <= c; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //System.out.println(i);
                count++;//显示个数
            }
        }
        System.out.println(count);
    }
}
