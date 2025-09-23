package com.it_heima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入周数");
        String week=sc.next();
        switch (week){
            case "周一":
                System.out.println("跑步");
                break;
            case "周二":
                System .out.println("游泳");
                break;
            case "周三":
                System .out.println("慢走");
                break;
            case "周四":
                System .out.println("动感单车");
                break;
            case "周五":
                System .out.println("拳击");
                break;
            case "周六":
                System .out.println("爬山");
                break;
            case "周日":
                System .out.println("吃一顿");
                break;
            default:
                System.out.println("请输入正确周数");
                break;
        }
    }
}
