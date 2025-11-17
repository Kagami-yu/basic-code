package com.itheima.mysort;

public class a05_QuickSortDemo {
    public static void main(String[] args) {
        //快速排序
        //定义基准数
        int[] arr = {45, 86, 7, 2, 3, 9, 4, 12, 79, 83, 66, 44};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        if (i >= j) {return;}//递归出口
        int start = i;
        int end = j;
        //定义基准数
        int baseNum = arr[i];
        while (end != start) {
            while (start < end && arr[end] >= baseNum) {
                end--;
            }
            while (end > start && arr[start] <= baseNum) {
                start++;
            }
            //交换元素
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        //递归排序左右部分--这个时候start和end指向基准数
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
