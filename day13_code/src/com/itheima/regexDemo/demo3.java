package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本, 目前企业中用的最多的是Java8和Java11"+
                "因为这两个是长期支持版本，下一个长期支持版本是Java17, 相信在未来不久Java17也会逐渐登上历史舞台";
        //获取正则表达式对象
        Pattern p=Pattern.compile("(?i)(Java)\\d{0,2}");//不区分大小写
        //获取文本匹配器对象，拿m去读取str，找复合p规则的子串
        Matcher m=p.matcher(str);
        //利用循环获取
        //m.find()返回数据为boolean类型
        while(m.find()){
            System.out.println(m.group());//储存符合子串的容器
        }
    }
}
