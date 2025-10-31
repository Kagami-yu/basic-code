package com.itheima.mathDemo;


public class demo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-66));//int a取绝对值--66
        System.out.println(Math.ceil(86.66));//double a向上取整--87.0
        System.out.println(Math.floor(-86.66));//double a向下取整--  -87.0
        System.out.println(Math.round(8.66));//四舍五入--9
        System.out.println(Math.round(8.46));//四舍五入--8
        System.out.println(Math.max(9, 50));//取其中的最大值--50
        System.out.println(Math.pow(2, 3));//取a的b次幂，可以为负数相当于开根--8.0
        System.out.println(Math.random());//随机[0,1)的数
        System.out.println(Math.sqrt(25));//开平方--5.0
        System.out.println(Math.cbrt(125));//开立方--5.0
    }
}
