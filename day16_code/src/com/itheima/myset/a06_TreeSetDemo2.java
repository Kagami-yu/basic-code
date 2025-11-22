package com.itheima.myset;

import java.util.TreeSet;
import java.util.function.Consumer;

public class a06_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        创建TreeSet集合，添加三个学生对象
            需求：
                姓名年龄
                按学生年龄排序，年龄相同按名字字母排序（暂时不考虑中文）
                年龄姓名一样则认为同一个人
            自己创建对象需要指定比较规则
                方法一：
                    默认排序规则/自然排序
                    Student实现Comparable接口，重写里面的抽象方法，再指定比较规则
                    ================================================
                    @Override
                    public int compareTo(Student1 o) {
                        //指定排序规则
                        //先年龄后姓名
                        int res=this.getAge()-o.getAge();
                        return res;
                    }//o：已经再红黑树存在的元素；this：当前要添加的元素
                方法二：
                    比较器排序：创建TreeSet对象时候，传递比较器Comparator指定规则

         */
        Student1 s1 = new Student1("zhangsan",18);
        Student1 s2 = new Student1("lisi",19);
        Student1 s3 = new Student1("zhangsan",18);
        Student1 s4 = new Student1("wangwu",17);
        TreeSet<Student1> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);

    }
}
