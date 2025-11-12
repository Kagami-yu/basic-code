package com.itheima.regexDemo;

public class demo6 {
    public static void main(String[] args) {
    /*
    * public String[] matches(String regex)--判断字符串是否满足正则表达式的规则
    * public String replaceAll(String regex,String newStr)--按照正则表达式的规则进行替换
    * public String[] split(String regex)--按照正则表达式的规则切割字符串
    *
    * */
        String str="小诗诗sdasfafgfyu小丹丹fdfdfsdfs小慧慧";
        String res1=str.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(res1);
        String[] res2=str.split("[\\w&&[^_]]+");
        for (int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);
        }
    }
}
