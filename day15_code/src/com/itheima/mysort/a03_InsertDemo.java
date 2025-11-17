package com.itheima.mysort;


public class a03_InsertDemo {
    public static void main(String[] args) {
        //插入排序，先把数组分为有序或者无序，通过遍历将无序数组里的元素插入到有序数组当中
        //一般来说插入排序都从第二位开始
        int[] arr = {3, 1, 44, 38, 5, 47, 56, 2, 83, 91, 57, 42, 61};
        //找到无序数组从哪个索引开始
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        //遍历startIndex后的数组元素
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
