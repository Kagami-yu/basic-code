package com.itheima.skiplopp;

public class SkiploppDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if (i==3){
                //结束本次循环，继续下次
                continue;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
    }
}
