package com.itheima.MygenericsDemo;

public class GenericsDemo2 {
    public static void main(String[] args) {
        //类型后面有泛型，创建对象的时候要传递类型
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(0));
        //System.out.println(list.toString());
        // System.out.println(引用)  这条语句在编译期会被编译器自动优化成
        //System.out.println(引用.toString()) ;
        System.out.println(list);
        //可以直接打印出内容是因为我在重写的toString方法里用了Arrays.ToString
        //没有这段就只打印出地址值
    }
}
