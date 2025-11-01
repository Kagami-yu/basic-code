package com.itheima.cloneDemo;

import java.util.Objects;

public class objectsDemo {
    public static void main(String[] args) {
        int[] data={1,2,3};
        User u1=null;
        User u2=new User("zahng",18,data);

        boolean res=Objects.equals(u1,u2);//false
        System.out.println(res);
        /*
        方法底层先看u1是否为null，若为null直接返回false
        u1不是null就利用u1调用equals方法，此时u1是User类型，所以调用User里的equals方法
        如果没有重写比较地址值，重写了比较属性值
         */


        //public static boolean isNull(Object obj) 判断对象是否为null，是null返回true否则返回false
        User u3=new User();
        User u4=null;
        System.out.println(Objects.isNull(u3));//false
        System.out.println(Objects.isNull(u4));//true

        //public static boolean nonNull(Object obj) 判断对象是否为null，是null返回false否则返回true,与isnull相反
    }
}
