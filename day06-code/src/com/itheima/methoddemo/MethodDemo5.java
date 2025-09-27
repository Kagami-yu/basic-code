package com.itheima.methoddemo;
/*
方法带返回值的调用
public static 返回值 方法名 (参数) {
        方法体
        return 返回值
}
 */
public class MethodDemo5 {
    public static void main(String[] args) {
       /* //不能直接调用，需要赋值调用
        //getSum(20,10.1,30);
        double sum=getSum(10,10.1,30);
        System.out.println(sum);//50.1
        //或者输出调用
        System.out.println(getSum(10,10.1,30));//50.1
        */
        double sum1=getSum(10,10.1,30);
        double sum2=getSum(16,10.1,30);
        double sum3=getSum(10,10.1,37);
        double sum4=getSum(10,10.9,30);
       // double result=sum1+sum2+sum3+sum4;
       // System.out.println("该年收入为"+result);
        System.out.println("该年收入为"+(sum1+sum2+sum3+sum4));
    }
    public static double getSum(double num1,double num2,double num3){
        double res=num1+num2+num3;
        return res;//返回给方法的调用处
    }
}
