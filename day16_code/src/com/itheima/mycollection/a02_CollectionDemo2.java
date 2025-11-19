package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a02_CollectionDemo2 {
    public static void main(String[] args) {
        /*
        Iterator迭代器，迭代器是集合专用的遍历方式,不依赖索引
            迭代器遍历
                Iterator<E> iterator() 获取一个迭代器对象
                boolean hasNext() 判断当前指向的位置是否有元素
                E next() 获取当前指向的元素并移动指针
           迭代器遍历完毕指针不会复位，要重新遍历要再new
           循环中只能使用一次next方法
           迭代器遍历是不能用集合的方法进行添加或者删除
         */
        Collection<String> coll=new ArrayList<>() ;
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        Iterator<String> it=coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
