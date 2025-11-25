package com.itheima.map;

import java.util.*;

public class a05_MapDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        map.put(1,"key1");
        map.put(2,"key2");
        map.put(3,"key3");
        map.put(4,"key4");
        map.put(5,"key5");
        Set<Integer> integers = map.keySet();
        for(Integer key:integers){
            System.out.println(key+":"+map.get(key));
        }

        //===============================================
        Map<Student,String> map1=new TreeMap<>();
        map1.put(new Student("zs",18),"guangdong");
        map1.put(new Student("ls",17),"hainan");
        map1.put(new Student("ww",20),"yunnan");
        map1.put(new Student("zs",18),"sishuang");
        Set<Map.Entry<Student, String>> entries = map1.entrySet();
        entries.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}