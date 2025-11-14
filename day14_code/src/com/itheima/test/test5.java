package com.itheima.test;

import java.time.LocalDate;
import java.util.Calendar;

public class test5 {
    public static void main(String[] args) {
        //jdk7
        //1.靠月份获取
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,2,1);//月份0-11
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        if(day1==29){
            System.out.println("2000是闰年");
        }else{
            System.out.println("2000是平年");
        }
        //2.靠一年有多少天获取
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2001,0,1);
        calendar1.add(Calendar.DAY_OF_YEAR,-1);
        int day2 = calendar1.get(Calendar.DAY_OF_YEAR);
        if(day2==366){
            System.out.println("2000是闰年");
        }else{
            System.out.println("2000是平年");
        }

        //jdk8
        LocalDate date1 = LocalDate.of(2000,3,1);//月份1-12
        LocalDate day3 = date1.minusDays(1);
        System.out.println(day3.getDayOfMonth());//29
        LocalDate date2 = LocalDate.of(2001,1,1);
        LocalDate day4 = date2.minusDays(1);
        System.out.println(day4.getDayOfYear());//366

        //jdk8的判断闰年的方法,是返回true，否返回false
        boolean f=date1.isLeapYear();
        System.out.println(f);
    }
}
