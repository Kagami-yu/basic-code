package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
        Collection（接口）为单列集合
            List（接口）系列--ArrayList，LinkedList，Vector
            <list系列添加的元素有序(存和取的数值一致)，可重复，有索引>
            Set（接口）系列--HashSet，TreeSet
                               ->LinkedHashSet
            <set系列添加的元素无序，不可重复，无索引>
            系列后的均为实现类
         */
        /*
        public boolean add(E e)添加对象到集合
        public void clear()清除集合里的对象
        public boolean remove(E e)将指定对象删除
        public boolean contains(Object obj)判断集合是否包含该对象
        public boolean isEmpty()判断当前集合是否为空
        public int size()返回集合的长度
         */
        //Collection是一个接口，不能直接创建对象，学习他时只能创建他实现类的对象
        Collection<String> c=new ArrayList<>();//多态
        //1.添加
        //往list系列集合中add返回值永远为true，set系列有false
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println(c);
        c.remove("aa");
        System.out.println(c);

        System.out.println(c.contains("bb"));//true
        System.out.println(c.contains("aa"));//false

        System.out.println(c.isEmpty());//false

        System.out.println(c.size());

        c.clear();
        System.out.println(c);
    }
}
