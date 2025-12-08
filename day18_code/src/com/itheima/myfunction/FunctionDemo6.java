package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {
        /*
        引用数组的构造方法
            格式数据类型[]::new
         目的
            创建一个指定类型的数组
         需求
            集合中储存一些数据，转移到数组中
         细节
            数组的类型，要和流中数据类型保持一致
        */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Integer[] arr=list.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {//value相当于原集合的list.size()
//                return new Integer[value];
//            }
//        });

        Integer[] arr=list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
