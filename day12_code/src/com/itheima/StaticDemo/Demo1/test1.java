package com.itheima.StaticDemo.Demo1;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("yu", 18);
        Student s2 = new Student("yuz", 15);
        Student s3 = new Student("yuzi", 25);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int max = GetMax.getMax(list);
        System.out.println(max);
    }
}
