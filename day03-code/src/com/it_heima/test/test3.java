package com.it_heima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请点击办理业务对应的数字");
        int a = sc.nextInt();
        /*switch (a) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
            default:
                System.out.println("即将退出服务");
        }*/
        if (a == 1) {
            System.out.println("机票查询");
        } else if (a == 2) {
            System.out.println("机票预订");
        } else if (a == 3) {
            System.out.println("机票改签");
        }else{
            System.out.println("退出服务");
        }
    }
}
