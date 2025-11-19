package com.itheima.lambdaDemo;

import java.sql.SQLOutput;

public class LambdaDemo2 {
    public static void main(String[] args) {
//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("swimming~~~");
//            }
//        });
        method(()->{System.out.println("hello");});
    }
    public static void method(Swim s) {
        s.swimming();
    }
}
interface Swim{
    public abstract void swimming();
}