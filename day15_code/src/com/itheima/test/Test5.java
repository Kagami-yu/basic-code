package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        //增加小明有可能一次爬三层台阶的可能
        System.out.println(getSum(20));
    }
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return getSum(n-1)+getSum(n-2)+getSum(n-3);
    }
}
