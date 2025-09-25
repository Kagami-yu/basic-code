package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int num=0;
        //遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
            num=num+arr[i];
        }
        //求和
        System.out.println(num);
    }
}
