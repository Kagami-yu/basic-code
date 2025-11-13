package com.itheima.jdk08datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime bir = LocalDateTime.of(2007,1,7,0,0,0);
        System.out.println(bir);
        //时间间隔（所有单位）
        System.out.println("相差的年数:"+ChronoUnit.YEARS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的月数:"+ChronoUnit.MONTHS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的周数:"+ChronoUnit.WEEKS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的天数:"+ChronoUnit.DAYS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的时数:"+ChronoUnit.HOURS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的分数:"+ChronoUnit.MINUTES.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的秒数:"+ChronoUnit.SECONDS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的毫秒数:"+ChronoUnit.MILLIS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的微妙数:"+ChronoUnit.MICROS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的纳秒数:"+ChronoUnit.NANOS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的半天数:"+ChronoUnit.HALF_DAYS.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的十年数:"+ChronoUnit.DECADES.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的世纪数:"+ChronoUnit.CENTURIES.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的千年数:"+ChronoUnit.MILLENNIA.between(ldt, bir));//第二个参数减第一个参数
        System.out.println("相差的纪元数:"+ChronoUnit.ERAS.between(ldt, bir));//第二个参数减第一个参数
    }
}
