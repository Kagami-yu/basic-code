package com.itheima.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        perimeter(10,50);
    }
    public static void perimeter(double length, double width){
        double res=(length+width)*2;
        System.out.println("周长为"+res);
    }
}
