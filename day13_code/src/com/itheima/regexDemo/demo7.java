package com.itheima.regexDemo;
//捕获分组
public class demo7 {
    public static void main(String[] args) {
//        判断一个字符串开头和结尾是否一致
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("61236".matches(regex1));
        System.out.println("m123m".matches(regex1));
        System.out.println("a123b".matches(regex1));//false
        String regex2="(.+).+\\1";
        System.out.println("ab123ab".matches(regex2));
        System.out.println("acc123acc".matches(regex2));
        System.out.println("a12123a12".matches(regex2));
        System.out.println("a%%123a%%".matches(regex2));
        //*零次或多次
//        String regex3="(.)\\1*.+\\1+";
        String regex3="((.)\\2*).+\\1";
        System.out.println("abd123abd".matches(regex3));//f
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("awb123ab".matches(regex3));//f
        System.out.println("###123###".matches(regex3));
    }
}
