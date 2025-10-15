package com.itheima;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigcount=0;
        int smallcount=0;
        int numbercount=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //cahr类型的变量再参与计算的时候自动类型替身为int--查询ascii码表
            if(c>='A' && c<='Z'){
                bigcount++;
            }else if(c>='a' && c<='z'){
                smallcount++;
            }else if(c>='0' && c<='9'){
                numbercount++;
            }
        }
        System.out.println("大写字母个数为"+bigcount);
        System.out.println("小写字母个数为"+smallcount);
        System.out.println("数字个数为"+numbercount);
    }
}
