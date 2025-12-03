package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*
        filter 过滤
        limit  获取前几个元素
        skip   跳过前几个元素
         */
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "张三","张瑞","张三丰","张飒","历史","李四","王五");
//        list.stream().filter(new Predicate<String>() {
////            返回true表示数据保留
////            返回false表示数据舍弃
//            @Override
//            public boolean test(String s) {
////              以张开头的留下
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));

        //stream为一次性的，不能重复引用，一般用链式
        System.out.println("===================================");
        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length()==2)
                .forEach(s-> System.out.println(s));
        //流不会改变原数组集合的数据
        System.out.println(list);//[张三, 张瑞, 张三丰, 张飒, 历史, 李四, 王五]
        System.out.println("===================================");
        //limit(n)  n表示个数
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("===================================");
        //skip(n)    n表示个数
        list.stream().skip(3).forEach(s-> System.out.println(s));
    }
}
