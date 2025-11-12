package com.itheima.jdk07datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        //定义两个date对象，比较哪个时间在前，哪个时间在后
        Random random=new Random();
        Date date1=new Date(Math.abs(random.nextInt()));
        Date date2=new Date(Math.abs(random.nextInt()));
        System.out.println(date1);
        System.out.println(date2);
        if(date1.getTime()<date2.getTime()){
            System.out.println("date1晚于date2");
        }else if(date1.getTime()>date2.getTime()){
            System.out.println("date2晚于date1");
        }else{
            System.out.println("时间一致");
        }
    }

    private static void extracted() {
        //打印距离时间原点1年后的时间
        //获取时间原点
        Date date=new Date(0L);
        long time=date.getTime();
        time=time+1000L*60*60*24*365;
        date.setTime(time);
        System.out.println(date);
    }
}
