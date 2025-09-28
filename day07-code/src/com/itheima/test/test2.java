package com.itheima.test;


//找101-200间的质数，并且输出所有的质数
public class test2 {
    public static void main(String[] args) {
        //假定一个数为质数
        //boolean flag = true;要循环得放到for里面
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            //第一次误写成j<200,导致每个i都可能除到自己被判断成非质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("质数" + i);
            }
        }
        System.out.println(count);
    }
}