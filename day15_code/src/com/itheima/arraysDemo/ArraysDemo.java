package com.itheima.arraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        /*
        public static String toString()将数组变为字符串，源码用StringBuilder
        public static int[] copeOf(原数组,新数组长度)拷贝数组
        public static int[] copeOfRange(原数组,起始索引，结束索引)//根据长度选择自动补全默认数据或部分拷贝
        public static void fill(数组,元素)填充数组
        public static void sort(数组)按照默认方式进行排序
        public static void sort(数组,排序顺序)按照制定规则排序
         */

        //toString将数组变为字符串
        int[] arr1 = {1, 28, 13, 54, 51, 16, 7, 18, 91, 10};
        System.out.println("转为字符串====");
        System.out.println(Arrays.toString(arr1));
        extracted(arr1);
        System.out.println("数据拷贝====");
        System.out.println(Arrays.copyOf(arr1, arr1.length));
        extracted(arr1);
        System.out.println("数据自定义拷贝====");
        System.out.println(Arrays.copyOfRange(arr1, 1, 5));
        extracted(arr1);
        System.out.println("数组数据填充====");
        Arrays.fill(arr1, 9);
        extracted(arr1);
        System.out.println("数据排序====");
        Arrays.sort(arr1);
        extracted(arr1);
        System.out.println("数据逆向排序====");
        Integer[] arr2 = {1, 28, 13, 54, 51, 16, 7, 18, 91, 10};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        IntegerToInt(arr2);
    }

    private static void extracted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void IntegerToInt(Integer[] arr) {
        int[] arr3 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        extracted(arr3);
    }
}
