package com.itheima.test;
//原地翻转，消耗算力少
public class test10_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //for (int i= 0,int j = arr.length - 1;i < j;i++, j--)不能写两个int
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //双指针反转，[0]交换[4],[1]交换[3]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");//5,4,3,2,1
        }
    }
}
