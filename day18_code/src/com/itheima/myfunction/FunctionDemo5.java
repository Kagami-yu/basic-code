package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        /*
         方法引用（类名引用成员方法）
         格式
                类名::成员方法
         需求
                集合里面一些字符串，要求变成大写后进行输出

         方法引用的规则
         1.需要有函数式接口
         2.被引用的方法必须已经存在
         3.被引用方法的形参，需要跟抽象方法第二个形参到最后一个形参保持一致，返回值需要保持一致
         4.被引用的方法的功能必须要满足当前需求

         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbbb", "ccc","ddd");
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(System.out::println);
        //如下无形参，而apply有形参，但不会报错
        /*
        public String toUpperCase() {
            return toUpperCase(Locale.getDefault());
    }
         */
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
