package com.itheima.polymorphic;

public class test1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("yu");
        s.setId(12);
        Teacher t=new Teacher();
        t.setName("oo");
        t.setId(22);

        register(t);//教师
        register(s);//学生
    }

    //想要注册的方法既能接受学生的信息又能接受教师的信息
    //使用父类方法
    public static void register(Person p){
        p.show();
    }
}
