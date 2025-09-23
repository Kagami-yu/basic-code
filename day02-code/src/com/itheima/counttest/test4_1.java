package com.itheima.counttest;

import java.util.Scanner;

public class test4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out .println("第一只重量/kg");
        int weight1=sc.nextInt();
        System.out .println("第二只重量/kg");
        int weight2=sc.nextInt();
       // System.out.println(weight1==weight2);
        // 输出只能为true和false
        String res=weight1==weight2? "相同":"不同";
        System.out.println(res);
        System.out.println(weight1==weight2? "相同":"不同");
    }
}
