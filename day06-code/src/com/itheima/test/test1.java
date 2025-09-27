package com.itheima.test;

public class test1 {
    public static void main(String[] args) {
        double sum1=perimeter(10,50);
        double sum2=perimeter(30,30);
        if(sum1>sum2){
            System.out.println("第一个长方形面积大于第二个");
        }else{
            System.out.println("第二个长方形面积大于第一个");
        }
    }
    public static double perimeter(double length, double width) {
        return length * width;
    }
}
