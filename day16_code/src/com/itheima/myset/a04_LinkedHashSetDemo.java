package com.itheima.myset;

import java.util.LinkedHashSet;

public class a04_LinkedHashSetDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("张三",18);
        Student1 s2 = new Student1("lisi",19);
        Student1 s3 = new Student1("wangwu",22);
        Student1 s4 = new Student1("张三",18);
        LinkedHashSet<Student1> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        //有序
        lhs.forEach(s-> System.out.println(s));
    }
}
