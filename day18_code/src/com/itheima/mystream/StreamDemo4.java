package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo4 {
    /*
        map     转换流里的数据类型

        注意1：中间方法，返回新的stream流，原来的stream流只能返回一次
        注意2：修改stream流中的数据，不会影响原来集合或数组中的数据
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "张三-18","张瑞-19","张三丰-100","张飒-12","历史-5000","李四-26","王五-24");

        //需求：只获取年龄并进行打印
        //String->int
        //第一个类型   流中原本的数据类型
        //第二个类型   要转成之后的类型

        //apply里的形参表示流里面的每一个数据
        //返回值表示转换之后的数据

        //当map执行完毕后流上数据变为整数
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] splits=s.split("-");
                return Integer.parseInt(splits[splits.length-1]);
            }
        });
        list.stream()
                .map(s-> s.split("-")[1])
                .forEach(s-> System.out.println(s));
    }
}
