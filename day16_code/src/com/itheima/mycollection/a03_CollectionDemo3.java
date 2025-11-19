package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
        Collection的三种遍历方式
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历

        增强for循环只能用在list集合和数组
        2.增强for遍历格式
            for(数据类型 类量名:集合/数组)
        细节:修改for循环的第三方变量不会改变集合中原本的数据
         */
        Collection<String> coll=new ArrayList<>() ;
        coll.add("zahnsan");
        coll.add("lisi");
        coll.add("wangwu");
        //利用增强for循环遍历
        for(String s:coll){
            System.out.println(s);
        }
    }
}
