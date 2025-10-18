package com.itheima.PackageDemo;

import java.util.ArrayList;

/*
基本数据类型对应的包装类
byte ---- Byte
short --- short
char ---- Character  ***
int ----  integer    ***
long ---- Long
float --- Float
double -- Double
boolean - Boolean
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建int类型的集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(110);
        list.add(101);

        String res = "[";
        for (int i = 0; i < list.size(); i++) {
            if (list.size() - 1 == i) {
                res = res + list.get(i);
                break;
            }
            res = res + list.get(i) + ",";

        }
        System.out.println(res + "]");
    }
}
