package com.itheima.arraydemo;
//动态初始化:手动指定数组长度
//数组类型[]数组名=new 数组类型[数组长度]
public class ArrayDemo3 {
    public static void main(String[] args) {
        String[] arr=new String[10];
        arr[0]="zhangsan";
        arr[1]="lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//null
        /*默认初始化值规律
            整数类型：0
            小数类型：0.0
            字符类型（char）：'/u0000' 空格
            引用数据类型：null
            boolean：false
         */
    }
}
