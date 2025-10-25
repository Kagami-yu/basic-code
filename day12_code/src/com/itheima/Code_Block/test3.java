package com.itheima.Code_Block;

import java.util.ArrayList;

public class test3 {
    //数据的初始化
    static ArrayList<Student> list=new ArrayList<>();
    static {
        Student s1 = new Student("yu", 18);
        Student s2 = new Student("pu", 28);
        list.add(s1);
        list.add(s2);
    }
    public static void main(String[] args) {

    }
}
