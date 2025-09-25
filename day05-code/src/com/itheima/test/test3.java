package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数");
        int n = sc.nextInt();
        //假定n为一个质数
        boolean falg = true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                falg = false;
                System.out.println("该数不为质数");
                break;
            }
        }
        if(falg){
            System.out.println("该数为质数");
        }
    }
}
