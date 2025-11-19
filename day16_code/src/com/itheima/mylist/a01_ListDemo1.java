package com.itheima.mylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class a01_ListDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法
        void add(int index,E element) 在此集合中的指定位置插入指定元素
        E remove(int index) 删除指定索引出的元素，返回被删除的元素
        E set(int index,E element) 修改指定索引处的元素，返回被修改元素
        E get(int index) 返回指定索引处元素
         */
        List<String> list = new ArrayList<>();
        list.add("zahnsan");
        list.add("wangwu");
        list.add("lisi");
        System.out.println(list);
        //添加指定元素到指定索引
        list.add(1,"zhaoliu");
        System.out.println(list);//1索引会让位给新增元素
        //删除指定索引出的元素，返回被删除的元素
        boolean flag = list.remove("wangwu");
        System.out.println(flag);
        System.out.println(list);
        //修改数据
        String res = list.set(0, "abc");
        System.out.println(res);
        System.out.println(list);
        //返回指定索引元素
        String s = list.get(0);
        System.out.println(s);
    }
}
