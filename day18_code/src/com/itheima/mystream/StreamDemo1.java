package com.itheima.mystream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {
    /*
        单列集合                default Stream<E> stream()                  Collection中的默认方法
        双列集合                无                                           无法直接使用stream流
        数组                   public static<T> Stream<T> of(T...values)    Arrays工具类中的静态方法
        一堆零散数据(同类型)     public static<T> Stream<T> of(T...values)    Stream接口中的静态方法
     */
    public static void main(String[] args) {
        //单列集合
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c","d");
        //获取stream流
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("=====================================");
        //双列集合
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        //1.先获取keySet
        map.keySet().stream().forEach(s-> System.out.println(s));
        //2.用entry将键值对装进set集合
        //map底层重写了toString方法，所以是键=值
        System.out.println("=====================================");
        map.entrySet().stream().forEach(s-> System.out.println(s));
        //将值作为流
        map.values().stream().forEach(s-> System.out.println(s));
        System.out.println("=====================================");
        int[] arr1 = {1,2,3,4,5};
        String[] arr2={"a","b","c"};
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
        System.out.println("=====================================");
        //零散数据要同类型
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of("a","b","c","d").forEach(s-> System.out.println(s));
        //零散数据也可以是一个数组，因为Stream.of()底层就是把数据装进数组
        //不过不能是基本数据类型的数组，基本数据类型会把每一个数组当成一个数据存入，输出时是地址值
        System.out.println("=====================================");
        Stream.of(arr1).forEach(s-> System.out.println(s));//[I@7530d0a
        Stream.of(arr2).forEach(s-> System.out.println(s));

    }

}
