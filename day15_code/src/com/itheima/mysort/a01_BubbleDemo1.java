package com.itheima.mysort;

public class a01_BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {5, 4, 3, 6, 8};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {//减i的目的是冒泡排序每次排序都把最大值拍到最右边
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
