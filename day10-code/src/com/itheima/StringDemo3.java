package com.itheima;

import java.util.Scanner;

public class StringDemo3 {
    //public char charAt(int index):根据索引返回字符
    //public int length():返回此字符串的长度
    //数组长度:数组名.length--属性
    //字符串长度:字符串对象.length()--方法
    //键盘录入一个字符串，遍历字符串
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            //i依次表示字符串的每一个索引
            char c=s.charAt(i);
            System.out.print(c+", ");
        }
    }
}
