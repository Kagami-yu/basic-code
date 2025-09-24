package com.it_heima.test;

import java.util.Scanner;

/*
求商和余数，且不用乘法，除法和%
 */
public class test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("被除数");
        int a=sc.nextInt();
        System.out.println("除数");
        int b=sc.nextInt();
        int count=0;
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println("余数为"+a);
        System.out.println("商为"+count);
    }
}
