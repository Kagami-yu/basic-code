package com.itheima.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a03_MapDemo3 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("zhangsan",18),"guangdong");
        map.put(new Student("lisi",20),"yunnan");
        map.put(new Student("wangwu",19),"hainan");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        map.entrySet().forEach( entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Student() {
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        int i=this.getAge()-o.getAge();
        i=i==0?this.getName().compareTo(o.getName()):i;
        return i;
    }
}