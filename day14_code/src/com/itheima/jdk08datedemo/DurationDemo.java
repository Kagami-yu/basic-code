package com.itheima.jdk08datedemo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        //侧重于秒于纳秒
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime bir = LocalDateTime.of(2007,1,7,0,0,0);
        System.out.println(bir);
        Duration duration = Duration.between(bir,ldt);//第二个参数-第一个参数
        System.out.println("相差的时间间隔对象为:"+duration);//PT165260H53M57.045S
        System.out.println("==============================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
    }
}
