package com.itheima.test3;

public class StudentTest {
        //入口
    public static void main(String[] args) {
        //创建方法
        Student s=new Student();
        System.out.println(s);//Student方法的地址值
        System.out.println(s.name+"..."+s.age);//调用方法里面的值，无赋值为默认初始化值
        //赋值
        s.name="阿1";
        s.age=10;
        System.out.println(s.name+"..."+s.age);
        s.study();//调用student方法里的study方法

        //set..或者get..不能直接用等号赋值
        s.setEmail("123456");
        System.out.println(s.getEmail());
    }
}
