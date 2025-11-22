package com.itheima.myset;

import java.util.HashSet;
import java.util.Objects;

public class a03_HashCodeDemo3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("lisi",18);
        Student1 s2 = new Student1("wangwu",19);
        Student1 s3 = new Student1("lisi",18);
        Student1 s4 = new Student1("zhangsan",20);
        HashSet<Student1> set = new HashSet<>();
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));
        set.forEach(student-> System.out.println(student));
    }
}
class Student1{
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student1{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}