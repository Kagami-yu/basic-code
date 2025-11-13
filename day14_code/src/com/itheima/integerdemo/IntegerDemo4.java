package com.itheima.integerdemo;

public class IntegerDemo4 {
    public static void main(String[] args) {
        /*
        public static String toBinaryString(int i)得到二进制
        public static String toOctalString(int i)得到八进制
        public static String toHexString(int i)得到十六进制
        public static int parseInt(String s)将字符串类型的整数转化为int类型的整数
         */

        //1.把整数转换为二进制
        String str1=Integer.toBinaryString(110);
        System.out.println(str1);
        //2.把整数转换为八进制
        String str2=Integer.toOctalString(110);
        System.out.println(str2);
        //3.把整数转换为十六进制
        String str3=Integer.toHexString(110);
        System.out.println(str3);
        //4.将字符串类型的整数转化为int类型的整数
        int i=Integer.parseInt("256");
        System.out.println(i+1);
        //细节1：在类型转换的时候括号中的参数只能是数字不能是其他，否则报错
        //细节2：8种包装类中，除了Character都有对应的parseXxx方法，进行转换
        String str4="true";
        Boolean bool=Boolean.parseBoolean(str4);
        System.out.println(bool);
    }
}
