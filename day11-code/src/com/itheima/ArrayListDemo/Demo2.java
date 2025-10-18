package com.itheima.ArrayListDemo;

import java.util.ArrayList;

/*
boolean add(E e)   添加

boolean remove(E e)  删除
E remove(int index)

E set(int index,E e)修改

E get(int index) 查询
int size()   获取长度
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //boolean res=list.add("aaa");
        //System.out.println(res);//true
        //添加元素
        list.add("aaa");
        list.add("bb");
        list.add("c");
        System.out.println(list);//[aaa,bb,c]
        //删除
        list.remove("aaa");//true
        System.out.println(list);//[bb,c]

        String str1=list.remove(0);
        //返回被删除元素
        System.out.println(str1);//bb

        //修改
        String str2=list.set(0,"stir");//返回被修改的值--str2=c
        System.out.println(list);//[stir]

        //查询
        String str3=list.get(0);
        System.out.println(str3);//stir

        //遍历
        list.add("oo");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
    }
}
