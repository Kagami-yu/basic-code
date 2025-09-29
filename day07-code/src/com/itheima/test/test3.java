package com.itheima.test;
//复制数组
public class test3 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int[] arr2=new int[5];
        for(int j=0;j<arr1.length;j++){
            arr2[j]=arr1[j];
            System.out.print(arr2[j]+" ");
        }
    }
}
