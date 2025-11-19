package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class a02_ListDemo2 {
    public static void main(String[] args) {
        //List系列集合的两个删除方法
        //1.直接删除元素
        //2.通过索引删除--调用方法时如果方法出现重载，优先调用实参和形参类型相同的那个方法
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //删除元素->remove(index i)类型为Integer所以在这默认先调用索引方法
//        list.remove(1);
//        System.out.println(list);
        //强制调用元素1删除
        //1.先手动装箱，将基本数据类型的1变为Integer类型
        Integer i=Integer.valueOf(1);
        //再调用remove时删除的是元素1
        list.remove(i);
        System.out.println(list);
    }
}
