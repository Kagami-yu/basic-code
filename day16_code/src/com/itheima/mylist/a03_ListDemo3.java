package com.itheima.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class a03_ListDemo3 {
    public static void main(String[] args) {
        /*
        List集合的遍历方式
            迭代器遍历
            列表迭代器遍历
            增强for循环
            lambda表达式遍历
            普通for循环(因为list集合存在索引)
         */
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //1.迭代器遍历
        Iterator<String> iterator=list.iterator();//获取迭代器
        while (iterator.hasNext()){//查看是否有元素存在
            System.out.print(iterator.next()+" ");//获取元素，移动指针
        }
        System.out.println();
        //2.lambda表达式遍历
        list.forEach(o-> System.out.print(o+" "));
        //3.增强for循环
        System.out.println();
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        //4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //5.列表迭代器
        //获取列表迭代器对象，里面的指针默认也是指向0索引
        ListIterator<String> lit=list.listIterator();
        //额外添加一个方法，在遍历的过程中，可以添加数据
        while (lit.hasNext()){
            String str=lit.next();
            if("a".equals(str)){
//                list.add("q")用add会报错
                lit.add("q");//用迭代器本身的方法
            }
        }
        System.out.println(list);
    }
}
