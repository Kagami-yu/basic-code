package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//有条件的爬取
/*
* ?理解为前面的数据Java
* =表示Java后面跟的数据
* :获取整体的数据
* !后面所带的数据符合则不取
* 但是在获取时，之获取前半部分
* */
public class test4 {
    public  static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本, 目前企业中用的最多的是Java8和Java11"+
                "因为这两个是长期支持版本，下一个长期支持版本是Java17, 相信在未来不久Java17也会逐渐登上历史舞台";
        String regex1="((?i)Java)(?=8|11|17)";
        String regex2="((?i)Java)(?:8|11|17)";
        String regex3="((?i)Java)(?!8|11|17)";
        Pattern p=Pattern.compile(regex2);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
