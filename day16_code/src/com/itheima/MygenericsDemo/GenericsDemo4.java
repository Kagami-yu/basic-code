package com.itheima.MygenericsDemo;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
        泛型类接口的两种使用方式
            ->1.实现类给出具体的类型
              2.实现类延续泛型，创建实现类对象时再确定类型
         */
        MyArrayList2 list = new MyArrayList2();//实现类明确类型
//        list.add(1);//这个时候只能存String类型
        list.add("a");
        MyArrayList3<String> list2 = new MyArrayList3<>();//实现类不明确类型,创建对象的时候要明确泛型

    }
}
