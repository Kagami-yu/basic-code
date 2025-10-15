package com.itheima;

import java.util.Scanner;

//字符串反转
public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str=sc.next();
        String res=redown(str);
        System.out.println(res);
    }


    //反转字符串的方法
    public static String redown(String str){
        String res="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            res=ch+res;
        }
        return res;
    }
}
