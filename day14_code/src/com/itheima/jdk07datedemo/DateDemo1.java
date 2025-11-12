package com.itheima.jdk07datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //获取当前时间
        Date date1=new Date();
        System.out.println(date1);//Wed Nov 12 15:47:41 CST 2025
        //获取指定时间，距离时间原点开始计算
        Date date2=new Date(0L);//long类型
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970
        //setTime修改时间
        date2.setTime(1000L);
        System.out.println(date2);//Thu Jan 01 08:00:01 CST 1970
        //getTime获取当前时间的毫秒值
        long time1=date2.getTime();
        System.out.println(time1);
    }
}
