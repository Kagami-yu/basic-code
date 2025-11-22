package com.itheima.myset;

import java.util.TreeSet;

public class a05_TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        不重复，无序，可排序
        可排序：默认按照元素从小到大排序
        TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都比较好
         */
        //需求：利用TreeSet存储整数并进行排序
        //String，包装类底层已经重写了hashcode和equals方法
        TreeSet<Integer> ts = new TreeSet<>();
        System.out.println(ts.add(4));
        System.out.println(ts.add(3));
        System.out.println(ts.add(3));
        System.out.println(ts.add(1));
        System.out.println(ts);//[1,3,4]
    }
}
