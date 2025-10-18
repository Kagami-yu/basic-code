package com.itheima;

public class StringTest16 {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "edcba";
        System.out.println(compare(a, b));
    }

    //比较的方法
    public static boolean compare(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            a=rotate(a);
            if (a.equals(b)) {
                return true;
            }
        }
        return false;
    }

    //旋转的方法
    public static String rotate(String str) {
        char first = str.charAt(0);
        str = str.substring(1, str.length());
        String s = str + first;
        return s;
    }
}

