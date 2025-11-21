package com.itheima.MygenericsDemo;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}//提供空参构造

    //类中定义一个静态方法addAll，用来添加多个集合的元素
    //<E>泛型要写在修饰符后面public static都是修饰符，所以写在static后
    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
}
