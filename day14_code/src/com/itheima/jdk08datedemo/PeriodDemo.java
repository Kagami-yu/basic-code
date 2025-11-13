package com.itheima.jdk08datedemo;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        //侧重于年月日
        //当前本地年月日
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //生日的年月日
        LocalDate bir=LocalDate.of(2007,1,4);
        System.out.println(bir);

        Period period=Period.between(bir,ld);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象："+period);//P18Y10M9D
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());//总月份
    }
}
