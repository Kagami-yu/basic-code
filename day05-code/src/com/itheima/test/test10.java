package com.itheima.test;

/*
定义一个数组
交换前：1,2,3,4,5
交换后：5,4,3,2,1
 */
//倒序拷贝，占用算力多
public class test10 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[arr1.length];
        for (int a = 0; a < arr1.length; a++) {
            System.out.print(arr1[a]);
            arr2[a] = arr1[arr1.length - 1 - a];
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
