package com.itheima.counttest;

public class test4_2 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int a = height1 > height2 ? height1 : height2;
        int b = a > height2 ? a : height2;
        System.out.print(b);
    }
}
