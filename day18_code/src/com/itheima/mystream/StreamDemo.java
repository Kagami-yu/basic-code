package com.itheima.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "张三-18-男","张瑞-19-女","张三丰-100-男","张飒-12-男","历史-5000-男","李四-26-女","王五-24-男");

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toList());
        System.out.println(newList);

        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toSet());
        System.out.println(newSet);


        /**
         * toMap参数一表示键规则，参数二表示值规则
         * 参数一：
         *      Function泛型一：表示流中每一个数据类型
         *              泛型二：表示Map集合中键的数据类型
         *
         *      方法apply形参：依次表示流里面的每一个数据
         *              方法体：生成键的代码
         *              返回值：已经生成的键
         *
         * 参数二：
         *      Function泛型一：表示流中每一个数据类型
         *             泛型二：表示Map集合中值的数据类型
         *
         *     方法apply形参：依次表示流里面的每一个数据
         *             方法体：生成值的代码
         *             返回值：已经生成的值
         */
//        Map<String,Integer> newMap=list.stream()
//                .filter(s->"男".equals(s.split("-")[2]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split("-")[0];
//                    }
//                },new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split("-")[1]);
//                    }
//                }));
        Map<String,Integer> newMap=list.stream()
                .filter(s->"男".equals(s.split("-")[2]))
                .collect(Collectors
                        .toMap( s-> s.split("-")[0] ,s-> Integer.parseInt(s.split("-")[1])));
        System.out.println(newMap);
    }
}
