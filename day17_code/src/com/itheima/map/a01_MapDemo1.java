package com.itheima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a01_MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value) 添加元素
        V remove(Object key) 根据键删除键值对元素
        void clear() 移除所有键值对元素
        boolean containsKey(Object key) 判断集合是否包含指定的键
        boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean isEmpty() 判断集合是否为空
        int size() 集合的长度，也就是集合中随机键值对的个数
         */
        Map<String ,String> map = new HashMap<>();
        map.put("zhangsan","xioaming");
        map.put("lisi","xioahuang");
        map.put("wangwu","xioali");
        //通过键找值
        //把键放在单列集合
        Set<String> keys = map.keySet();
        //增强for
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
        //迭代器
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
        //lambda表达式
        map.keySet().forEach(key-> System.out.println(key+":"+map.get(key)));
    }
}
