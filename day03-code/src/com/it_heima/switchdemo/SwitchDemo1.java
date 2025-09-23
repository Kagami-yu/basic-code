package com.it_heima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        String noodele = "兰州拉面";//值可以改
        switch (noodele) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "油泼面":
                System.out.println("吃油泼面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            default:
                System.out.print("吃方便面");
                break;
        }
    }
}
