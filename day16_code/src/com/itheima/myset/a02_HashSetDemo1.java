package com.itheima.myset;

import java.util.Objects;

public class a02_HashSetDemo1 {
    public static void main(String[] args) {
        /*
            哈希值：
                对象的整数表现形式:
                1.如果没有重写HashCode方法，计算出的哈希值是不同的
                2.如果已经重写了HashCode方法，不同对象只有属性值相同，计算出的哈希值就是相同的
                3.但在一小部分情况下，不同的属性值或不同的地址值计算出来的哈希值也有可能一样（哈希碰撞）
         */
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);
        //如果没有重写HashCode方法，不同对象计算出的哈希值是不一样的
        //1.未重写
//        System.out.println(s1.hashCode());//793589513
//        System.out.println(s2.hashCode());//1313922862
        //2.已重写
        System.out.println(s1.hashCode());//-1461067297
        System.out.println(s2.hashCode());//-1461067297
        //String的hashcode方法已经重写
        //3.哈希碰撞                                                                                                                                          
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }
}
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}