package com.itheima.test;

import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        Random random = new Random();
    //int a=random.nextInt(100) + 1;
        // System.out.println(a);
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(100) + 1;
            System.out.print(a+" ");
            arr[i] = a;
            sum = sum + arr[i];
        }
        System.out.println("和为" + sum);
        double average = (double) sum / 10;
        System.out.println("平均数为" + average);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("小于平均数的有" + count + "个");
    }
}
