package com.itheima.jdk07datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String str="2000-1-1";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//解析成date对象
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");//指定格式
        System.out.println(sdf1.format(sdf.parse(str)));

    }
}
