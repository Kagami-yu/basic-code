package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
    /*
    distinct        元素去重，依赖(hashCode和equals方法)
    concat          合并a和b两个流为一个流
     */
        ArrayList<String> list1 = new ArrayList();
        Collections.addAll(list1, "张三", "张三", "张三", "张瑞", "张三丰", "张飒", "历史", "李四", "王五");
        ArrayList<Integer> list2 = new ArrayList();
        Collections.addAll(list2,1,2,3,4);
        list1.stream().distinct().forEach(s-> System.out.println(s));

        Stream
                .concat(list1.stream(),list2.stream())
                .forEach(s-> System.out.println(s));

    }
}
