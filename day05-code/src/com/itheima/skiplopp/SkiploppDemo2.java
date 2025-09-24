package com.itheima.skiplopp;

public class SkiploppDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");//先吃再判断就不会出现没有吃第三个包子
            if (i == 3) {
                //结束整个循环，继续下次
                break;
            }
        }
    }
}
