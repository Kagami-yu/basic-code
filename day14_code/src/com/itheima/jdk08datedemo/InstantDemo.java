package com.itheima.jdk08datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        /*
        static Instant now()获取当前时间的Instant对象(标准时间)
        static Instant ofXXX(long epochMilli) 根据毫秒/纳秒/秒获取Instant对象
        ZoneDateTime atZone(ZoneId zone) 指定时区
        boolean isXxx(Instant otherInstant)判断系列的方法
        Instant minusXxx(long millisToSubtract)减少时间系列的方法
        Instant plusXxx(long millisToSubtract)增加时间系列的方法
         */
        //1.获取当前时间的Instant对象(标准时间)
        //Instant now=Instant.now();
        //System.out.println(now);
        //2.根据毫秒/纳秒/秒获取Instant对象
        Instant instants1=Instant.ofEpochMilli(5L);
        System.out.println(instants1);
        Instant instants2=Instant.ofEpochSecond(5L);
        System.out.println(instants2);
        Instant instants3=Instant.ofEpochSecond(5L,6L);//传递秒和纳秒
        System.out.println(instants3);
        //3.指定时区
        ZonedDateTime time1 = Instant.now().atZone(ZoneId.of("Asia/Aden"));
        System.out.println(time1);//指定时区时间
        System.out.println(Instant.now());//标准时间
        //4.isXxx判断--调用者比参数
        Instant instants4=Instant.ofEpochSecond(5L);
        Instant instants5=Instant.ofEpochSecond(0);
        if(instants4.isBefore(instants5)){
            System.out.println(instants4+"早");
        }else if(instants4.isAfter(instants5)){
            System.out.println(instants4+"晚");
        }
        //5.Instant minusXxx(long millisToSubtract)
        Instant instants6=Instant.ofEpochMilli(3000L);
        Instant instants7=instants6.minusMillis(1000L);
        System.out.println(instants7);
        System.out.println(instants6==instants7);//false
        Instant instants8=instants6.plusMillis(10000L);
        System.out.println(instants8);
    }
}
