package com.itheima;

import org.omg.PortableServer.ForwardRequest;

import java.util.Scanner;

public class StringDemo6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        String res=reverse(str);
        System.out.println(res);
    }



    public static String reverse(String str){
        String res="";
        //i表示索引，不过是倒着的
        for (int i = str.length()-1; i >= 0; i--) {
            char ch=str.charAt(i);
            res+=ch;
        }
        return res;
    }
}
