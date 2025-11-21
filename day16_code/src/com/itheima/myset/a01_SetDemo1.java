package com.itheima.myset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class a01_SetDemo1 {
    public static void main(String[] args) {
        //set是一个继承Collection的接口，不是实现类不能创建他的对象
        Set<String> set = new HashSet<String>();
        set.add("Zhangsan");//元素添加不能重复，重复会返回false
        set.add("lisi");
        set.add("Wangwu");
        //遍历
        //1.迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        //2.增强for循环
        System.out.println();
        for(String s: set){
            System.out.print(s+" ");
        }
        //3.lambda表达式遍历
        System.out.println();
        set.forEach( s-> System.out.print(s+" "));
    }
}
