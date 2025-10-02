package com.itheima.test;

import java.net.SocketTimeoutException;

public class test10 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum=0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int sum=getSum(quarterArr);
            System.out.println("第"+(i+1)+"季度的营业额为"+sum);
            yearSum+=sum;
        }
        System.out.println("全年总营业额为"+yearSum);
    }
    //计算每个季度营业额
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
