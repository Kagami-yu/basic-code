package com.itheima;

import sun.font.FontRunIterator;

import java.util.Scanner;

//金额转换--2173转化为支票形式的金额
public class StringDemo7 {
    public static void main(String[] args) {
        String[] strarr = {"零", "壹", "贰", "叄", "肆", "伍", "陆", "柒", "捌", "玖"};
        int[] moneyarr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        //当成字符串
        System.out.println("请输入你的金额");
        String money = sc.next();//2113
        String res = "";
        for (int i = 0; i < money.length(); i++) {
            char ch = money.charAt(i);//键盘录入的字符串拆解成一个一个字符--3,1,1,2
            for (int j = 0; j < moneyarr.length; j++) {
                if (moneyarr[j] + 48 == ch) {
                    res = res + strarr[j];
                }
            }
        }
        System.out.println(res);//贰壹壹叄--4
        String[] newstrarr = new String[7];
        //外循环--把字符串拆分填入数组中
        int start=newstrarr.length-res.length();
        for (int i = 0; i < res.length(); i++) {
            newstrarr[start+i] = res.charAt(i) + "";//录入字符串
        }
        for (int i = 0; i < start; i++) {
            newstrarr[i] = "零";
        }
        String[] unitarr={"佰","拾","萬","仟","佰","拾","元"};
        for (int i = 0; i < newstrarr.length; i++) {
            System.out.print(newstrarr[i]+unitarr[i]);
        }
    }
}