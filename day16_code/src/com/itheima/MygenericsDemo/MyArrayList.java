package com.itheima.MygenericsDemo;

import java.util.Arrays;

public class MyArrayList<E>{
    Object[] obj=new Object[10];//定义初始长度
    int size;//定义数组索引
    /*
    E:表示是不确定的类型，该类型在类名后面已经定义过了
    e:形参的名字，变量名
     */
    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;//添加成功
    }
    public E get(int index){//用E是因为不确定数据类型，所以用泛型
        return (E)obj[index];//数据一旦存在集合自动提升为Object类型，再次拿出来用的时候要强转
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
