package com.itheima.jdk07datedemo;

import java.util.Calendar;
import java.util.Date;

public class DateDemo6 {
    public  static void main(String[] args) {
        /*
        public static Calendar getInstance()获取当前时间的日历对象

        public final date getTime()获取日期对象
        public final setTime(Date date)给日历设置日期对象

        public long getTimeInMillis()拿到时间毫秒值
        public void setTimeInMillis(long millis)给日历设置时间毫秒

        ***
        public int get(int field)获取日期中的某个字段信息
        public void set(int field,int value)修改日历的某个字段信息
        public void add(int field,int amount)为某个字段增加/减少指定的量
         */

        //细节1.日历对象的获取--Calendar是一个抽象类不能直接new，要用静态方法获取
        //底层:根据系统的不同时区获取不同的日历，默认为当前时间
        // 日历会把时间的纪元，年月日时分秒等等放到一个数组里
        //0.纪元 1.年 2.月 3.一年中的第几周 4.一个月中的第几周 5.一个月中的第几天 ...16.
        //细节2.月份是0~11.0代表1月
        //星期:1~7,1为星期日，2为星期一...
        Calendar c = Calendar.getInstance();//静态方法获取
        System.out.println(c);
        //修改日历表示的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c.getTime());//Date类型
        System.out.println(c);
//        public int get(int field)获取日期中的某个字段信息
//        public void set(int field,int value)修改日历的某个字段信息
//        public void add(int field,int amount)为某个字段增加(正数)/减少(负数)指定的量
    //修改日历信息
        c.set(Calendar.YEAR,2025);
        c.set(Calendar.MONTH,11);
    //增减日历信息
        c.add(Calendar.DAY_OF_MONTH,10);
        c.add(Calendar.YEAR,10);
        int month=c.get(2);
        int year=c.get(1);
        int date=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);
//        c.set(Calendar.YEAR,2025);放在获取前才有效更改
        System.out.println(year+"-"+(month+1)+"-"+date+"-"+getWeek(week));
    }
    public static String getWeek(int index){
        String[] arr={"","周日","周一","周二","周三","周四","周五","周六"};
        return arr[index];
    }
}
