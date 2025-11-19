package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a04_CollectionDemo4 {
    public static void main(String[] args) {
        /*
        利用lambda表达式遍历
            default void forEach(Consumer<? super T> action)
         */
        Collection<String> coll = new ArrayList<>();
        coll.add("zahnsan");
        coll.add("lisi");
        coll.add("wangwu");
        //accept(String t)中t依次表示集合中的每一个数据
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String t) {
//                System.out.println(t);
//            }
//        });
        coll.forEach(t -> System.out.println(t));
    }
}
