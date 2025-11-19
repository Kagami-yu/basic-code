package com.itheima.test;

public class Test4 {
    /*
    小明爬楼梯，可以一次爬一节，也可以一次爬两节，若梯子有20节，一共有多少种爬法
     */
    public static void main(String[] args) {
        System.out.println(getSum(20));
    }
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return getSum(n-1)+getSum(n-2);
    }
}
