package com.itheima.jdk08datedemo;

import java.time.ZoneId;
import java.util.Set;

/*
jdk7与jdk8最大的差别是修改时间不会影响原对象，而是new一个新对象，保证了信息的安全性
 */
public class ZoneIdDemo {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()获取java中文支持的所有时区--返回集合，无索引
        static ZineId systemDefault() 获取系统默认时区
        static ZoneId of(String zoneId) 获取一个指定时区
         */
        //1.获取所有时区的名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());//601
        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai
        //3.获取指定的时区
        ZoneId zoneId1=ZoneId.of("Asia/Aden");
        System.out.println(zoneId1);//可以与其他类结合在一起使用其他时区的时间
    }
}
