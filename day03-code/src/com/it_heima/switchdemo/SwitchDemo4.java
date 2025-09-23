package com.it_heima.switchdemo;
/*
    switch和if第三种格式的各自使用场景
    if的第三种格式：对范围的判断
    switch：把有限个数据一一列举出来，让我们任选其一；如demo3
*/
public class SwitchDemo4 {
    public static void main(String[] args) {
        int score=10;
        if (score>=90 && score<=100) {
            System.out.println("一等奖");
        }
        else if (score>=80) {
            System.out.println("二等奖");
        }
        else if (score>=70) {
            System.out.println("三等奖");
        } else {
            System.out.println("没有奖项");
            }
        }
    }
