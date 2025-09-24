package com.it_heima.test;

import java.util.Scanner;

/*
回文数--给你一个整数x
        如果x是一个回文整数，打印true，否则打印false
回文数是正序和到序都一样的数--123不是  121是
 */
public class test5 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        int b=a;
        while (a != 0) {
            int ge = a % 10;
            a = a / 10;
            num = num * 10 + ge;
        }
            System.out.println(num);
        if (num == b) {
            System.out.println("该数字为回文数");
           // break;break对应switch
            }else{
            System.out.println("该数字不是回文数");
        }
    }
}
