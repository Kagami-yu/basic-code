package com.itheima.bigintegerDemo;

import java.math.BigInteger;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        /*
        获取随机大整数，范围[0-2的num次方-1]
         */
        BigInteger b1=new BigInteger(4,new Random());
        System.out.println(b1);

        /*
        获取一个指定大整数，不能写字母或小数，类型为biginteger
         */
        BigInteger b2=new BigInteger("1000");
        System.out.println(b2);
        /*
        获取指定进制的大整数
         */
        BigInteger b3=new BigInteger("100",2);
        System.out.println(b3);//4
        /*
        BigInteger b4=BigInteger.valueOf(long val)不能超过long范围
        -16到16会有优化，重复调用地址值不会改变
        相加后会生成新的biginteger数据
         */
        BigInteger b4=BigInteger.valueOf(1);
        BigInteger b5=BigInteger.valueOf(1);
        System.out.println(b4==b5);//true
        BigInteger b6=BigInteger.valueOf(2);
        BigInteger b7=b4.add(b6);
        System.out.println(b7==b4);//false
        System.out.println(b7==b6);//false
    }
}
