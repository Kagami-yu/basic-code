package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test4 {
    public static void main(String[] args) throws ParseException {
        //jdk7
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String bir="2007-01-04";
        Date birth= sdf.parse(bir);
        System.out.println((date.getTime()-birth.getTime())/(1000*60*60*24));
        //jdk8
        LocalDate ldtNow=LocalDate.now();
        LocalDate ldtBir=LocalDate.of(2007,1,4);
        System.out.println(ChronoUnit.DAYS.between(ldtBir,ldtNow));
    }
}
