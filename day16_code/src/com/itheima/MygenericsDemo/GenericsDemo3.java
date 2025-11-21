package com.itheima.MygenericsDemo;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*
        定义一个工具类
        类中定义一个静态方法addAll，用来添加多个集合的元素
         */
        ArrayList<String> list = new ArrayList<String>();
        ListUtil.addAll(list, "a", "b", "c", "d");
        System.out.println(list);
    }
}
