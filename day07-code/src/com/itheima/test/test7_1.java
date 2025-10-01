package com.itheima.test;

import java.util.Random;

//原数组打乱,双指针
public class test7_1 {
    public static void main(String[] args) {
        int arr[]={2,588,888,1000,10000};
        Random random=new Random();
        //随机抽取索引
        //int randomIndex=random.nextInt(arr.length);
        for(int i=0;i<arr.length;i++){
            int randomIndex=random.nextInt(arr.length);//随机数要参与循环，不然一个数循环所有
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
