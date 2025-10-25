package com.itheima.Code_Block;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public  static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("yu",18);
        Student s2=new Student("pu",28);
        list.add(s1);
        list.add(s2);
        Scanner sc=new Scanner(System.in);
        System.out.println("输入");
        String str=sc.nextLine();
    }
}
