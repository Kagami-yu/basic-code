package com.itheima.search;

public class a02_BasicSearchDemo2 {
    public static void main(String[] args) {
        //二分搜索:要求顺序必须得从小到大
        int[] arr = {21, 36, 45, 56, 67, 89, 88, 92, 123};
        int num = 92;//查找92这个数
        System.out.println(binarySearch(arr, num));
    }

    private static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (true) {
            if (min > max) {
                return -1;//return返回数值也可以结束循环
            }
            if (num > arr[mid]) {
                min = mid + 1;
                mid = (max + min) / 2;
            } else if (num < arr[mid]) {
                max = mid - 1;
                mid = (max + min) / 2;
            } else {
                return mid;//return返回数值也可以结束循环
            }
        }
    }
}
