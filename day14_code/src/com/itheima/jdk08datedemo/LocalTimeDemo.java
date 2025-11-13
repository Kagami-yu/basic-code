package com.itheima.jdk08datedemo;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //1.获取本地时间的日历对象(包含时分秒)
        LocalTime nowTime=LocalTime.now();
        System.out.println("今天的时间"+nowTime);

        //2.获取时分秒
        int hour=nowTime.getHour();
        int minute=nowTime.getMinute();
        int second=nowTime.getSecond();
        int nano=nowTime.getNano();//纳秒
        //获取指定时间对象
        LocalTime.of(8,20,1,1);//时/分/秒/纳秒
        //is系列方法，minus/plus系列方法，with系列方法,只能作用于时分秒
    }
}
