package com.itheima.jdk08datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        /*
        static ZoneDateTime now()获取当前时间的ZoneDateTime对象
        static ZoneDateTime ofXxx()获取指定时间ZoneDateTime对象
        ZoneDateTime withXXx(时间)修改时间系列的方法
        ZoneDateTime minusXxx(时间)减少时间系列的方法
        ZoneDateTime plusXxx(时间)增加时间系列的方法
         */
        //1.获取当前的时间对象(带时区)
        ZonedDateTime time1=ZonedDateTime.now();
        System.out.println(time1);
        //2.1)获取指定的时间对象(带时区)--按年月日时分秒方式指定
        ZonedDateTime time2=ZonedDateTime.of(2025,10,11,19,10,12,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time2);
        //2.2)通过Instant+时区的方式获取时间对象
        Instant instant=Instant.ofEpochMilli(0L);
        ZoneId zoneId=ZoneId.of("Asia/Shanghai");
        ZonedDateTime time3=ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time3);
        //3.withXxx修改时间系列的方法
        ZonedDateTime time4=time3.withYear(2035);
        System.out.println(time4);
        //4.减少时间
        ZonedDateTime time5=time4.minusYears(5);
        System.out.println(time5);
        //增加时间
        ZonedDateTime time6=time4.plusYears(5);
        System.out.println(time6);
    }
}
