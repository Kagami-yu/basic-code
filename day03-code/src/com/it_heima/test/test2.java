package com.it_heima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("用阿拉伯数字输入星期");
        int num=sc.nextInt();
       /* if (num>=1 && num<=5) {
            System.out.println("今天为工作日");
        }
        else if (num>=6 && num<=7) {
            System.out.println("今天为休息日");
        }else{
            System.out.println("此为无效数字");
        }*/
        switch(num){
        //case 1,2,3,4,5:只有jdk14以上才可以
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天为工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天为休息日");
                break;
            default:
                System.out.println("无效");
                break;
        }
    }
}
