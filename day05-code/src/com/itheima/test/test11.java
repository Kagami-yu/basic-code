package com.itheima.test;

import java.util.Random;

public class test11 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        Random random=new Random();
        //bound:是idea提示语法，不是java语法，只需(5)自动生成(bound:5)
        for(int j=0;j<arr1.length;j++) {
            int randomIndex=random.nextInt(arr1.length);//0-4
            int temp=arr1[j];//临时变量,暂存区
            arr1[j] = arr1[randomIndex];//随机替换
            arr1[randomIndex] = temp;//取暂存区
        }
        for(int j=0;j<arr1.length;j++) {
            System.out.print(arr1[j]+" ");//生成结果
        }
    }
}
