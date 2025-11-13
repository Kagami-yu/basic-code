package com.itheima.jdk08datedemo;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包含年月日)
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期"+nowDate);
        //2.获取指定时间的日历对象
        LocalDate ldDate=LocalDate.of(2019,12,1);
        System.out.println("指定日期"+ldDate);
        //3.get系列方法获取每一个属性质
        int year=ldDate.getYear();
        System.out.println(year);
        //4.1)获取月,方法1
        int month1=ldDate.getMonthValue();
        System.out.println(month1);
        //4.2)方法2
        Month month2=ldDate.getMonth();//JANUARY
        System.out.println(month2.getValue());//1月
        //5.获取日
        int day=ldDate.getDayOfMonth();
        System.out.println("day:"+day);
        //6.获取一年的第几天
        int dayOfYear=ldDate.getDayOfYear();
        System.out.println("dayOfYear:"+dayOfYear);
        //7.获取星期
        DayOfWeek dow=ldDate.getDayOfWeek();
        System.out.println(dow);//SUNDAY
        System.out.println(dow.getValue());//7
        //8.is开头的方法表判断--isBefore isAfter
        //9.minus开头表减，plus开头表加，只能是年月日

    }
}
