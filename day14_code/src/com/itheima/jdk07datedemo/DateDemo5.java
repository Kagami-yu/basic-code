package com.itheima.jdk07datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo5 {
    public static void main(String[] args) throws ParseException {
        String str1="2023年11月11日 0:01:00";
        String str2="2023年11月11日 0:11:0";
        String start="2023年11月11日 0:0:0";
        String end="2023年11月11日 0:10:0";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 H:m:s");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date str1Date = sdf.parse(str1);
        Date str2Date = sdf.parse(str2);
        if(str2Date.getTime()>=startDate.getTime()&&str2Date.getTime()<=endDate.getTime()){
            System.out.println("秒杀活动进行中");
        }else{
            System.out.println("参加活动失败");
        }
    }
}
