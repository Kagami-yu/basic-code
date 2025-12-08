package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        //引用构造方法--可以不用有返回值，因为构造方法完成就创造了一个对象
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "张三-18","张瑞-19","张三丰-100","张飒-12","历史-5000","李四-26","王五-24");

//        List<Student> newList= list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String name=s.split("-")[0];
//                int age=Integer.parseInt(s.split("-")[1]);
//                return new Student(name,age);
//            }
//        }).collect(Collectors.toList());

        List<Student> newList=list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
class Student{
    private String name;
    private int age;
    public Student(String str){
        String[] split = str.split("-");
        this.name=split[0];
        this.age=Integer.parseInt(split[1]);
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}