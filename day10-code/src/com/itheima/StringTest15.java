package com.itheima;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringTest15 {
    public static void main(String[] args) {
        String str = getnum();
        char[] cha = new char[str.length()];//1998
        String[] strarr2 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            cha[i] = ch;//1,9,9,8
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < cha.length; i++) {
            for (int j = 0; j < strarr2.length; j++) {
                if (cha[i] - 48 == j) {
                    sj.add(strarr2[j]);
                }
            }
        }
        System.out.println(sj.toString());
    }

    public static String getnum() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一串数字");
            String str = sc.next();
            //"\\d+"可以把纯数字的字符串当成数字看，检验是不是纯数字,boolean类型
            if (str.matches("\\d+") && str.length() <= 9) {
                return str;
            } else {
                System.out.println("无效数据");
            }
        }
    }
}

