package com.itheima.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//贪婪爬取：在爬取时尽可能多的爬取数据(默认)
//非贪婪爬取：在爬取时尽可能少的爬取数据
//ab+
//贪婪爬取--abbbbbbbbb
//非贪婪爬取--ab
public class Demo5 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，abbbbbbbbbbbbbbbbbb" +
                "经历了很多版本, 目前企业中用的最多的是Java8和Java11"+
                "因为这两个是长期支持版本，下一个长期支持版本是Java17, 相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p1=Pattern.compile("ab+");
        Pattern p2=Pattern.compile("ab+?");
        Matcher m1=p1.matcher(str);
        Matcher m2=p2.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
        while(m2.find()){
            System.out.println(m2.group());
        }
    }
}
