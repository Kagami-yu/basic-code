package com.itheima.methoddemo;
//方法定义与调用
public class MethodDemo1 {
    public static void main(String[] args) {
        //调用
        playGame();
        playGame();
    }
    /*  定义一个方法:驼峰命名
        方法大括号外打印方法体
     */

    public static void playGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("defeat");
    }
}
