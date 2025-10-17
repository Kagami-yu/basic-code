package com.itheima;

import java.util.StringJoiner;

//StringJoiner:--拼接字符串
//可以看做是一个容器，里面的内容也可变
//public StringJoiner(间隔符号);
//public StringJoiner(间隔符号,开始符号,结束符号)
public class StringDemo14 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("1").add("2").add("3");//只能添加字符串
        System.out.println(sj.toString());
    }
}
