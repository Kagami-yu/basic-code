package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo5 {
    public static void main(String[] args) {
        /*
            void forEach(Consumer action)      遍历
            long collect(Collector collector)       统计
            toArray()                          收集流中数据，放到数组中
         */
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "张三-18","张瑞-19","张三丰-100","张飒-12","历史-5000","李四-26","王五-24");

        System.out.println(list.stream().count());

        //toArray()空参--Object类型
        Object[] arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));
        //toArray(new IntFunction<? extends Object[]>)IntFunction的泛型：具体的数据类型
        //apply的形参表示流中数据的个数，要和数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
