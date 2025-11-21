package com.itheima.MygenericsDemo;

public class GenericsDemo1 {
    public static void main(String[] args) {
        /*
        没有泛型的时候，集合如何存数据
            ->没有泛型的时候，默认认为所有的数据类型为Object类型
            此时集合可以添加任意数据
            带来一个坏处：我们在获取数据的时候，无法使用他的特有行为（多态的弊端）
            如果要使用子类特有的属性得强转
        推出泛型后
            ->存入数据时就有单一的数据类型，存进去后自动提升为object类型，再次拿出来调用的时候
            底层会进行强转，因为存入的都是统一包装类数据，所以可以统一强转
         */
    }
}
