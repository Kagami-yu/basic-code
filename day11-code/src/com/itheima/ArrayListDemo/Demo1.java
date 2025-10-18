package com.itheima.ArrayListDemo;

import javax.swing.plaf.ScrollPaneUI;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //创建集合的对象
        //ArrayList<String> list=new ArrayList<>()
        //打印内容不是地址值而是集合中存储的数据,展示时会拿[]包裹
        //不能存储常规数据类型，要存得打包，一般存String类型
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//[]
    }
}
