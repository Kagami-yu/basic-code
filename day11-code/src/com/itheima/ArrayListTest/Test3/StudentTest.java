package com.itheima.ArrayListTest.Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0;i<3;i++){
            Student s=new Student();//每次循环创建新对象
            System.out.println("请输入姓名");
            String name=sc.next();//每次循环键盘录入新姓名
            System.out.println("请输入年龄");
            int age=sc.nextInt();//每次循环键盘录入新年龄

            s.setName(name);//将每次键盘录入的数据存入学生对象空参构造中
            s.setAge(age);

            students.add(s);//将录入学生对象的数据存入集合中
        }

        //遍历
        for (int i = 0; i < students.size(); i++) {
            //System.out.println(students.get(i));//打印出地址
            System.out.println(students.get(i).getAge()+","+students.get(i).getName());
        }
    }
}
