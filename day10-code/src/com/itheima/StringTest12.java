package com.itheima;

import java.util.Scanner;

//对称字符串
public class StringTest12 {
    public static void main(String[] args) {
        String str=getstring();
        StringBuilder sb=new StringBuilder(str);
        String newsb=sb.reverse().toString();//sb.reserve会改变StringBuilder内的sb
        if(str.equals(newsb)){
            System.out.println("该字符串为对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }
    }



    //键盘录入返回一个字符串
    public static String getstring(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        return str;
    }
}
