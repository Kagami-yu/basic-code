package com.itheima.test;

public class test2 {
    public static void main(String[] args) {
        //调用
        //compare((byte)1,(byte)2);
        byte a1=1;
        byte a2=2;
        compare(a1,a2);
    }
    //重载
    public static void compare(byte a1, byte a2){
        System.out.println("byte");
        System.out.println(a1==a2);
    }
    public static void compare(short b1, short b2){
        System.out.println("short");
        System.out.println(b1==b2);
    }
    public static void compare(int c1, int c2){
        System.out.println("int");
        System.out.println(c1==c2);
    }
    public static void compare(long d1, long d2){
        System.out.println("long");
        System.out.println(d1==d2);
    }
}
