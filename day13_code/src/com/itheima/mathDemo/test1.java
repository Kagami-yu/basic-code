package com.itheima.mathDemo;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入");
        int a = sc.nextInt();
        System.out.println(checkPrime(a));
    }
    //以16为例，除1*16外有2*8，4*4必有一个数大于等于本身的平方更，一个数小于等于本身的平方根
    private static boolean checkPrime(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
