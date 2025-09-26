package com.itheima.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        method1();//method1直接生成结果20，只接收打印部分
        method2(30,50);//80
    }
    public static void method1(){
        int a=10;
        int b=10;
        int result1=a+b;
        System.out.println(result1);
    }
    //改良
    public static void method2(int num1,int num2){
        int result2=num1+num2;
        System.out.println(result2);
    }
}
