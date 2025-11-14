package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数");
        String str=sc.nextLine();
        if(str.matches("[1-9](\\d)*")){
            int i=Integer.parseInt(str);
            System.out.println(toBinaryString(i));
        }else{
            System.out.println("数据格式不正确");
        }
    }
    public static int toBinaryString(int num) {
        //也可以用StringBuilder
        StringBuilder sb=new StringBuilder();
        String temp="";
        while (num != 0) {
            int rem = num % 2;
            num = num / 2;
            temp=rem+temp;
            sb.insert(0, rem);//插入，第一个是索引，第二个是要插入的数据
        }
        int binaryInt1=Integer.parseInt(temp);
        int binaryInt2=Integer.parseInt(sb.toString());
        return binaryInt2;
    }
}
