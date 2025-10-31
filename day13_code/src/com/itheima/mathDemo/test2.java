package com.itheima.mathDemo;

public class test2 {
    public static void main(String[] args) {
        //求3位数的水仙数
        for (int i = 100; i <= 999; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i) {
                System.out.println(i+"为水仙数");
            }
        }
        //求四位数的四爷玫瑰数
        for (int i = 1000; i <=9999 ; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000%10;
            if (Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4)==i) {
                System.out.println(i+"为四爷玫瑰数");
            }
        }
    }
}
