package com.itheima;

public class StringDemo8 {
    public static void main(String[] args) {
        String num="13112344321";
        //截取手机号码前三位,[index1,index2)
        String start=num.substring(0,3);
        //获取手机好后四位
        String end=num.substring(7);
        System.out.println(start+"****"+end);
    }
}
