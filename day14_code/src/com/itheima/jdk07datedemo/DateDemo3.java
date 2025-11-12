package com.itheima.jdk07datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat
        //1.格式化:把时间变成我们想要的格式
        //2.解析:把字符串表示的时间变为Date对象
        /*
        public SimpleDateFormat()默认格式
        public SimpleDateFormat(String pattern)指定格式

        public final String format(Date date)格式化(日期对象->字符串)
        public Date parse(String source)解析(字符串->日期对象)
         */
        String str="2023-1-11 11:11:11";
        //利用空参构造创造SimpleDateFormat对象
        //创建对象的格式要和字符串一样，不然会报错
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(str);
        System.out.println(parse);
    }

    private static void Method() {
        Date date = new Date(0L);
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String str = sdf1.format(date);//默认样式--70-1-1 上午8:00
        System.out.println(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒 E");
        System.out.println(sdf2.format(date));//1970年01月01日 08:00:00
    }
}
