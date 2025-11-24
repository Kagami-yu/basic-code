package com.itheima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a02_MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zhangsan","zhangsan1");
        map.put("lisi","lisi1");
        map.put("wangwu","wangwu1");
        //entries是键值对对象,返回set集合,每一个键值对存入set中，要获取得调用键值对的方法
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //增强for
        for(Map.Entry<String, String> entry:entries){
            //entry依次表示每一个键值对对象
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //lambda
        entries.forEach( entry-> System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
