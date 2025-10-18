package com.itheima.ArrayListTest;

import java.util.ArrayList;

//添加学生对象并遍历
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student stu1=new Student("zhangsan",19);
        Student stu2=new Student("zhangsi",20);
        Student stu3=new Student("zhangbo",20);
        //添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
