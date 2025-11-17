package com.itheima.mysort;

public class a04_RecursionDemo {
    public static void main(String[] args) {
        //递归求和
        System.out.println(method1(100));
        //递归求阶乘
        System.out.println(method2(10));
    }
    public static int method1(int num) {
        if (num == 1) {
            return 1;
        }
        return num + method1(num - 1);
    }
    public static int method2(int num) {
        if (num == 1) {
            return 1;
        }
        return num * method1(num - 1);
    }
}
